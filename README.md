# Kafka message test

Kafka web service try out


# Additional commands:

Starting kafka

```
cd /Users/ideltuva/workspace/kafka/kafka_2.12-2.1.1

bin/zookeeper-server-start.sh config/zookeeper.properties
bin/kafka-server-start.sh config/server.properties --override listeners=PLAINTEXT://0.0.0.0:9092 --override advertised.listeners=PLAINTEXT://localhost:9092
```

Topic creation could be run via `create_topic.sh`