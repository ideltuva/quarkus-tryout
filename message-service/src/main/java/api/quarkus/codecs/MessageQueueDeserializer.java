package api.quarkus.codecs;

import api.quarkus.model.MessageQueue;
import io.quarkus.kafka.client.serialization.JsonbDeserializer;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class MessageQueueDeserializer extends JsonbDeserializer<MessageQueue> {

    public MessageQueueDeserializer() {
        super(MessageQueue.class);
    }

}
