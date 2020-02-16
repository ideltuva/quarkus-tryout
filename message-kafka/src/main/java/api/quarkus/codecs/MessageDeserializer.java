package api.quarkus.codecs;

import api.quarkus.Message;
import io.quarkus.kafka.client.serialization.JsonbDeserializer;

public class MessageDeserializer extends JsonbDeserializer<Message> {

    public MessageDeserializer() {
        super(Message.class);
    }

}
