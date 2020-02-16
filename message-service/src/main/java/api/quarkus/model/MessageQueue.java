package api.quarkus.model;


import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class MessageQueue {
    String requestingSystem;

    String message;
    State messageStatus;
    public enum State {
        IN_QUEUE,
        IN_PROCESS,
        READY;
    }

    public MessageQueue(){

    }

    public static MessageQueue queued(Message message) {
        return new MessageQueue(message, State.IN_QUEUE);
    }

    public String getRequestingSystem() {
        return requestingSystem;
    }

    public void setRequestingSystem(String requestingSystem) {
        this.requestingSystem = requestingSystem;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public State getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(State messafeStatus) {
        this.messageStatus = messafeStatus;
    }

    public MessageQueue(Message message, State state) {
        this.message = message.getMessage();
        this.requestingSystem = message.getRequestingSystem();
        this.messageStatus = state;
    }



}