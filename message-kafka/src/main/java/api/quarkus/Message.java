package api.quarkus;


import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Message {

    int id;
    String message;
    String requestingSystem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
