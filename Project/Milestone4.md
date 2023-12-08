<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone4</td></tr>
<tr><td> <em>Student: </em> Mohammad Hussain (msh52)</td></tr>
<tr><td> <em>Generated: </em> 12/8/2023 5:56:56 AM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone4/grade/msh52" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Client can export chat history of their current session (client-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot of related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T09.37.32image.png.webp?alt=media&token=53e2f3d9-032f-4afd-ae9f-9b47a370bad5"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing screenshot of button as menu item to export chat history <br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T09.45.48image.png.webp?alt=media&token=f74d82f4-352a-496c-a57e-58946373a8e8"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the code snippet <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot of exported data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T09.38.38image.png.webp?alt=media&token=a6919a42-e368-43bc-b977-0ebdd811e683"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing screenshot of chat is being saved as (chat_exported_data)<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T09.39.07image.png.webp?alt=media&token=ca09e036-40cf-49ae-bf81-6d320e9b5473"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing screenshot of chat history exported successfully<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T09.39.36image.png.webp?alt=media&token=4cfc2503-77bc-4e5a-a148-79de40aebe92"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing it was saved under downloads as intended <br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T09.40.10image.png.webp?alt=media&token=145aaca0-3462-43ff-acdd-a503eb4e2724"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the chat history that was exported and opened in VS code<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T09.41.12image.png.webp?alt=media&token=5a8a3f34-bcc8-462d-ba0c-aefc5a129b60"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing that since user shah exported his chat history its only his chat<br>histroy not the other client <br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T09.47.01image.png.webp?alt=media&token=18df7d13-9114-4e7e-bd41-4ab71f0889d5"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing the code snippet <br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T10.56.21image.png.webp?alt=media&token=86bd7337-c847-4d10-93dd-9c64a623376b"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing screenshot of chat history being save as chat_exported_data<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>When a user decides to export the chat history, they interact with a<br>menu item defined in the Menu class, specifically the exportMenuItem. This menu item<br>is linked to the exportChatHistory method in the ClientUI class through an action<br>listener. ClientUI, which implements the ICardControls interface, then handles the export process. It<br>presents a file chooser dialog for the user to specify the save location<br>and then writes the accumulated chat messages from ChatPanel&#39;s chatHistory to the chosen<br>file.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Client's mute list will persist across sessions (server-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot of how the mute list is stored</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T09.50.34image.png.webp?alt=media&token=91e43722-d1d8-4bdb-bbe3-708bbe0de221"/></td></tr>
<tr><td> <em>Caption:</em> <p>as you can see from the sc user shah muted abul and noyon<br>and its written in .csv file  saved as shah_MuteList.cvs<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T09.52.44image.png.webp?alt=media&token=8baa1909-a67e-4864-b419-82063541ca1b"/></td></tr>
<tr><td> <em>Caption:</em> <p>the cvs file<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T09.54.42image.png.webp?alt=media&token=64ad29e2-d166-49fc-9114-7ba0542af729"/></td></tr>
<tr><td> <em>Caption:</em> <p>once unmuted the user is remove from the file<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the code saving/loading mute list</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T09.55.58image.png.webp?alt=media&token=71bc53af-e359-4947-b9e7-969c91824e18"/></td></tr>
<tr><td> <em>Caption:</em> <p>Clearly showing the saving logic that grabs the list and writes to the<br>file<br><br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T09.56.49image.png.webp?alt=media&token=805029eb-bfb0-42cc-b926-37f192813cee"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing how file is saved immediately once the user is muted and after<br>adding the user to the mute list (.cvs file)<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T09.57.10image.png.webp?alt=media&token=667ca7b8-6311-4bf5-b267-1b811336745f"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing how file is again saved immediately once the user is unmuted, so<br>the latest updated is available <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <div>The persistence of a client's mute list across sessions is implemented as follows:</div><div><br></div><div>Mute<br>and Unmute Commands: When a user executes a mute or unmute command, the<br>processMuteCommand and processUnmuteCommand methods manage these actions. They find the target client in<br>the current room and update their mute status. If muting, the target's username<br>is added to the sender's muteList, and if unmuting, it is removed.</div><div><br></div><div>Save and<br>Load Mute List: The saveMuteListToFile method writes the muteList to a CSV file,<br>saving the mute state persistently. The loadMuteListFromFile method is called when a ServerThread<br>initializes, loading the mute list from the file. This ensures that the mute<br>states are maintained across sessions.</div><div><br></div><div>Mute State Check: The isMuted method checks a user's<br>mute status, and setMuted updates it. These functions are essential for managing real-time<br>mute states during a session.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Client's will receive a message when they get muted/unmuted by another user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot showing the related chat messages</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T10.08.03image.png.webp?alt=media&token=d550e5e9-b837-4cde-8f08-da238f74ac8c"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing user noyon muted user abul. And user abul received messaged stating (noyon<br>muted you). also the user noyon received a message saying(You muted abul)<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T10.11.33image.png.webp?alt=media&token=946c368e-eb49-4e3c-a880-a44d7241c330"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing since user abul is muted by user noyon, therefore abul message is<br>not coming to user noyon)<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T10.12.48image.png.webp?alt=media&token=8f2d833c-1754-4cdb-9759-cfac7b0692e2"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing how user noyon unmuted and user abul. And user abul received a<br>message  saying (noyon unmuted you), and also noyon received message saying (you<br>unmuted abul)<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the related code snippets</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T10.15.04image.png.webp?alt=media&token=198883bc-4ca6-4722-8901-3fa5046c90df"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing screenshot of how processMuteCommand is handled <br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T10.16.09image.png.webp?alt=media&token=8bee094a-edbd-4572-bfa0-89d64a2e5240"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing screenshot of how processUnmuteCommand is handled <br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T10.16.44image.png.webp?alt=media&token=2022561b-72c6-41d0-9110-640b8796af5b"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing code snippet <br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T10.17.49image.png.webp?alt=media&token=827d2c66-0fc4-4428-9471-f9fe6bc7ecf6"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing screenshot of how mute is handled by Room<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <div>Implementing users when they get muted/unmuted involves the following steps:</div><div><br></div><div>Mute/Unmute Command Processing: In<br>the ServerThread class, the processMuteCommand and processUnmuteCommand methods handle mute and unmute commands.<br>When a user sends a mute or unmute command, these methods are invoked.</div><div><br></div><div>Notifying<br>the Target User: When a user is muted, the target client (the user<br>being muted) receives a notification about being muted. This is done by sending<br>a message to the target client's ServerThread. The message states that they have<br>been muted by the sender. Similarly, when a user is unmuted, they receive<br>a notification stating that they have been unmuted.</div><div><br></div><div>Notifying the Sender: After muting or<br>unmuting a user, the sender (the user who initiated the command) also receives<br>a confirmation message indicating that the mute or unmute action was successful.</div><div><br></div><div>Mute List<br>Management: When a user is muted, their name is added to the sender's<br>muteList. When unmuted, their name is removed from this list.</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> User list should update per the status of each user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot for Muted users by the client should appear grayed out</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T10.46.53image.png.webp?alt=media&token=90fadc48-0ba9-44a2-a9ef-8d5cfd00559d"/></td></tr>
<tr><td> <em>Caption:</em> <p>added sniping of the code to show that I attempted this feature but<br>was<br>unscuccssfull<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T10.47.18image.png.webp?alt=media&token=ae663190-ead6-4ca9-b5d0-b4ef7564eda6"/></td></tr>
<tr><td> <em>Caption:</em> <p>added sniping of the code to show that I attempted this feature but<br>was<br>unscuccssfull<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T10.47.37image.png.webp?alt=media&token=36f9f832-9d79-484b-87d0-0f411a09ed44"/></td></tr>
<tr><td> <em>Caption:</em> <p>added sniping of the code to show that I attempted this feature but<br>was<br>unscuccssfull<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T10.52.11image.png.webp?alt=media&token=3988f06a-43eb-4de6-9d5e-23034c0770be"/></td></tr>
<tr><td> <em>Caption:</em> <p>sc showing muted user [unable to successfully show grayed out muted user]<br><br><br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot for Last person to send a message gets highlighted</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T10.24.50image.png.webp?alt=media&token=319b3da2-8f93-41cf-83c4-ffe4fb01c8c2"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing last person getting highlighted. user shah is highlighted because he is the<br>last person to send messages<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T10.26.33image.png.webp?alt=media&token=1c777def-a20b-413b-b6a3-31e584c98d0f"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing last person getting highlighted. user noyon is highlighted because he is the<br>last person to send messages<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T10.27.32image.png.webp?alt=media&token=53e09ae3-d68e-4a5e-b17b-ffa8b0aa5cd7"/></td></tr>
<tr><td> <em>Caption:</em> <p>showing last person getting highlighted. user abul is highlighted because he is the<br>last person to send messages<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T10.28.36image.png.webp?alt=media&token=b9a77031-635d-4f4a-8560-5821b4efcf1b"/></td></tr>
<tr><td> <em>Caption:</em> <p>as you can see when the user noyon muted user abul, the last<br>person to send message for them is is noyon therefore he&#39;s highlighted, and<br>as for user abul, himself is the last person so he is highlighted<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fmsh52%2F2023-12-08T10.31.32image.png.webp?alt=media&token=d6f6a6d9-43f6-450f-95ea-e3ae60cba040"/></td></tr>
<tr><td> <em>Caption:</em> <p>in the sc you can see since user noyon muted user shah, noyon<br>is not receiving any message from shah, therefore the last person for user<br>noyon to send message is abul and abul is highlighted for him. and<br>as for the shah and abul, shah is the last person to send<br>message therefore for both of them user shah is highlighted since he is<br>the last person to send message.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>when a message is received, the onMessageReceive method in ClientUI class is triggered.<br>It calls the highlightUser method of the ChatPanel, which in turn calls the<br>updateUserListItem method of the UserListPanel. The updateUserListItem method iterates through all the components<br>in the userListArea. It checks for a component (a JEditorPane representing a user)<br>with a name matching the clientId of the message sender. Once found, it<br>changes the foreground color of that user&#39;s JEditorPane to red, making them stand<br>out in the user list. If the clientId does not match, the color<br>is set to black, ensuring that only the last sender is highlighted.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone4/grade/msh52" target="_blank">Grading</a></td></tr></table>