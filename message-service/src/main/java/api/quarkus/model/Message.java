package api.quarkus.model;


import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Message {

    String id;
    String message;
    String requestingSystem;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRequestingSystem() {
        return requestingSystem;
    }

    public void setRequestingSystem(String requestingSystem) {
        this.requestingSystem = requestingSystem;
    }


}
