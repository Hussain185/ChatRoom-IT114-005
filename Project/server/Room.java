package Project.server;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import Project.common.Constants;
import Project.server.ServerThread;

public class Room implements AutoCloseable {
	// server is a singleton now so we don't need this
    // protected static Server server;// used to refer to accessible server
    // functions
	private String name;
	private List<ServerThread> clients = Collections.synchronizedList(new ArrayList<ServerThread>());
	private Map<String, List<String>> mutedClients = new HashMap<>();
	private ConcurrentHashMap<Long, ServerThread> clientsById = new ConcurrentHashMap<>();
	private boolean isRunning = false;
	// Commands
	private final static String COMMAND_TRIGGER = "/";
	private final static String CREATE_ROOM = "createroom";
	private final static String JOIN_ROOM = "joinroom";
	private final static String DISCONNECT = "disconnect";
	private final static String LOGOUT = "logout";
	private final static String LOGOFF = "logoff";
	private static Logger logger = Logger.getLogger(Room.class.getName());

	public Room(String name) {
		this.name = name;
		isRunning = true;
	}

	private void info(String message) {
		logger.log(Level.INFO, String.format("Room[%s]: %s", name, message));
	}

	public String getName() {
		return name;
	}

	public boolean isRunning() {
		return isRunning;
	}

	protected synchronized void addClient(ServerThread client) {
		if (!isRunning) {
			return;
		}
		client.setCurrentRoom(this);
		if (clients.indexOf(client) > -1) {
			info("Attempting to add a client that already exists");
		} else {
			clients.add(client);
			sendConnectionStatus(client, true);
			sendRoomJoined(client);
			sendUserListToClient(client);
		}
	}

	protected synchronized void removeClient(ServerThread client) {
		if (!isRunning) {
			return;
		}
		clients.remove(client);
		if (clients.size() > 0) {
			sendConnectionStatus(client, false);
		}
		checkClients();
	}

	/***
	 * Checks the number of clients.
	 * If zero, begins the cleanup process to dispose of the room
	 */
	private void checkClients() {
		// Cleanup if room is empty and not lobby
		if (!name.equalsIgnoreCase("lobby") && clients.size() == 0) {
			close();
		}
	}

	/***
	 * Helper function to process messages to trigger different functionality.
	 * 
	 * @param message The original message being sent
	 * @param client  The sender of the message (since they'll be the ones
	 *                triggering the actions)
	 */
	private boolean processCommands(String message, ServerThread client) {
		boolean wasCommand = false;
		try {
			if (message.startsWith(COMMAND_TRIGGER)) {
				String[] comm = message.split(COMMAND_TRIGGER);
				String part1 = comm[1];
				String[] comm2 = part1.split(" ");
				String command = comm2[0];
				String roomName;
				wasCommand = true;
				switch (command) {
					case CREATE_ROOM:
						roomName = comm2[1];
						Room.createRoom(roomName, client);
						break;
					case JOIN_ROOM:
						roomName = comm2[1];
						Room.joinRoom(roomName, client);
						break;
					case DISCONNECT:
					case LOGOUT:
					case LOGOFF:
						Room.disconnectClient(client, this);
						break;
					default:
						wasCommand = false;
						break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wasCommand;
	}

	// Command helper methods
	protected synchronized ServerThread findClientByName(String name) {
        for (ServerThread client : clients) {
            if (client.getClientName().equalsIgnoreCase(name)) {
                return client;
            }
        }
        return null; // Return null if the client with the specified name is not found
    }

	protected static void getRooms(String query, ServerThread client) {
		String[] rooms = Server.INSTANCE.getRooms(query).toArray(new String[0]);
		client.sendRoomsList(rooms,(rooms!=null&&rooms.length==0)?"No rooms found containing your query string":null);
	}

	protected static void createRoom(String roomName, ServerThread client) {
		if (Server.INSTANCE.createNewRoom(roomName)) {
			Room.joinRoom(roomName, client);
		} else {
			client.sendMessage(Constants.DEFAULT_CLIENT_ID, String.format("Room %s already exists", roomName));
			client.sendRoomsList(null, String.format("Room %s already exists", roomName));
		}
	}

	/**
     * Will cause the client to leave the current room and be moved to the new room
     * if applicable
     * 
     * @param roomName
     * @param client
     */

	protected static void joinRoom(String roomName, ServerThread client) {
		if (!Server.INSTANCE.joinRoom(roomName, client)) {
			client.sendMessage(Constants.DEFAULT_CLIENT_ID, String.format("Room %s doesn't exist", roomName));
			client.sendRoomsList(null, String.format("Room %s doesn't exist", roomName));
		}
	}

	protected static void disconnectClient(ServerThread client, Room room) {
		client.setCurrentRoom(null);
		client.disconnect();
		room.removeClient(client);
	}
	// end command helper methods

	/***
	 * Takes a sender and a message and broadcasts the message to all clients in
	 * this room. Client is mostly passed for command purposes but we can also use
	 * it to extract other client info.
	 * 
	 * @param sender  The client sending the message
	 * @param message The message to broadcast inside the room
	 */

	// msh52
	// 12/8/2023
	protected synchronized void sendMessage(ServerThread sender, String message) {
		if (!isRunning) {
			return;
		}
		info("Sending message to " + clients.size() + " clients");
		if (sender != null && processCommands(message, sender)) {
			// command, don't broadcast
			return;
		}
		long from = (sender == null) ? Constants.DEFAULT_CLIENT_ID : sender.getClientId();
		synchronized (clients) {
			Iterator<ServerThread> iter = clients.iterator();
			while (iter.hasNext()) {
				ServerThread client = iter.next();
				// Check if the sender is muted by the client
				if (sender != null && client.hasUserMuted(sender.getClientName())) {
					// Skip sending the message if the sender is muted by this client
					continue;
				}
				// Send message to the client if not muted
				boolean messageSent = client.sendMessage(from, message);
				if (!messageSent) {
					// Handle disconnection if message sending fails
					iter.remove();
					handleDisconnect(iter, client);
				}
			}
		}
	}


	
	

	protected synchronized void sendUserListToClient(ServerThread receiver) {
		logger.log(Level.INFO, String.format("Room[%s] Syncing client list of %s to %s", getName(), clients.size(),
				receiver.getClientName()));
		synchronized (clients) {
			Iterator<ServerThread> iter = clients.iterator();
			while (iter.hasNext()) {
				ServerThread clientInRoom = iter.next();
				if (clientInRoom.getClientId() != receiver.getClientId()) {
					boolean messageSent = receiver.sendExistingClient(clientInRoom.getClientId(),
							clientInRoom.getClientName());
					// receiver somehow disconnected mid iteration
					if (!messageSent) {
						handleDisconnect(null, receiver);
						break;
					}
				}
			}
		}
	}

	protected synchronized void sendRoomJoined(ServerThread receiver) {
		boolean messageSent = receiver.sendRoomName(getName());
		if (!messageSent) {
			handleDisconnect(null, receiver);
		}
	}

	protected synchronized void sendConnectionStatus(ServerThread sender, boolean isConnected) {
		// converted to a backwards loop to help avoid concurrent list modification
		// due to the recursive sendConnectionStatus()
		// this should only be needed in this particular method due to the recusion
		if (clients == null) {
			return;
		}
		synchronized (clients) {
			for (int i = clients.size() - 1; i >= 0; i--) {
				ServerThread client = clients.get(i);
				boolean messageSent = client.sendConnectionStatus(sender.getClientId(), sender.getClientName(),
						isConnected);
				if (!messageSent) {
					clients.remove(i);
					info("Removed client " + client.getClientName());
					checkClients();
					sendConnectionStatus(client, false);
				}
			}
		}
	}

	private synchronized void handleDisconnect(Iterator<ServerThread> iter, ServerThread client) {
		if (iter != null) {
			iter.remove();
		}
		info("Removed client " + client.getClientName());
		checkClients();
		sendConnectionStatus(client, false);
		// sendMessage(null, client.getClientName() + " disconnected");
	}
	public void addClientById(long clientId, ServerThread clientThread) {
        clientsById.put(clientId, clientThread);
    }

    // Add a method to retrieve the client by their unique ID
    public ServerThread findClientById(long clientId) {
        return clientsById.get(clientId);
    }

	public void close() {
		Server.INSTANCE.removeRoom(this);
		isRunning = false;
		clients = null;
	}

    
}