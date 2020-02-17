import api.quarkus.model.Message;
import api.quarkus.model.MessageQueue;
import io.smallrye.reactive.messaging.annotations.Channel;
import io.smallrye.reactive.messaging.annotations.Emitter;
import org.springframework.web.bind.annotation.PostMapping;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {


    @Inject
    @Channel("messages")
    Emitter<Message> messages;

    @Inject
    @Channel("messagequeue")
    Emitter<MessageQueue> states;

    @POST
    @Path("/messaging")
    public Message messaging(Message message) {
        message.setId(getId());
        states.send(MessageQueue.queued(message));
        messages.send(message);
        return message;
    }

    private String getId() {
        return UUID.randomUUID().toString();
    }

}