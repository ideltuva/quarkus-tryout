package api.quarkus;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@ApplicationScoped
public class KafkaMessage {

    private static final Logger LOGGER = LoggerFactory.getLogger("Kafka-Message");

    private ExecutorService queue = Executors.newSingleThreadExecutor();

    @Incoming("messages")
    @Outgoing("message-queue")
    public CompletionStage<MessageQueue> process(Message message) {
        return CompletableFuture.supplyAsync(() -> {
            MessageQueue messageQueue = prepare(message);
            LOGGER.info("Message {} for {} is ready", message.getMessage(), message.getRequestingSystem());
            return messageQueue;
        }, queue);
    }

    MessageQueue prepare(Message message) {
        int delay = getPreparationTime();
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return new MessageQueue(message, MessageQueue.State.READY);
    }

    private Random random = new Random();

    int getPreparationTime() {
        return random.nextInt(5) * 1000;
    }

}