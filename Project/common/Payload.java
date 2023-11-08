package Project.common;

import java.io.Serializable;

public class Payload implements Serializable {
    // read https://www.baeldung.com/java-serial-version-uid
    private static final long serialVersionUID = 1L;// change this if the class changes

    /**
     * Determines how to process the data on the receiver's side
     */
    private PayloadType payloadType;

    public PayloadType getPayloadType() {
        return payloadType;
    }

    public void setPayloadType(PayloadType payloadType) {
        this.payloadType = payloadType;
    }

    /**
     * Who the payload is from
     */
    //payload sender 
    //private instance variable to store the sender's name
    private String sender;

    //gettter method to retrieve the sender name
    public String getSender() {
        return sender;
    }

    //setter method to set the sender name
    public void setSender(String sender) {
        this.sender = sender;
    }

    private long clientId;

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    /**
     * Generic text based message
     */
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    

    @Override
    public String toString() {
        return String.format("Type[%s],ClientId[%s,] Sender[%s], Message[%s]", getPayloadType().toString(),
                getClientId(), getSender(),
                getMessage());
    }
}