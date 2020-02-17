package api.quarkus.model;


import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Message {

    String id;
    String message;
    String requestingSystem;

    public Message() {

    }

    public String getId() {
        return id;
    }

    public Message setId(String id) {
        this.id = id;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Message setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getRequestingSystem() {
        return requestingSystem;
    }

    public Message setRequestingSystem(String requestingSystem) {
        this.requestingSystem = requestingSystem;
        return this;
    }


}
