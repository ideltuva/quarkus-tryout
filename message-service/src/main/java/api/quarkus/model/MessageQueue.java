package api.quarkus.model;


import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class MessageQueue {
    String messageId;
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

    public MessageQueue setRequestingSystem(String requestingSystem) {
        this.requestingSystem = requestingSystem;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public MessageQueue setMessage(String message) {
        this.message = message;
        return this;
    }

    public State getMessageStatus() {
        return messageStatus;
    }

    public MessageQueue setMessageStatus(State messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }

    public MessageQueue(Message message, State state) {
        this.messageId = message.getId();
        this.message = message.getMessage();
        this.requestingSystem = message.getRequestingSystem();
        this.messageStatus = state;
    }



}