# Kafka message test

Kafka web service try out.

## How to run
Starting message service accessible via UI localhost:8080
```
cd message-service
mvn compile quarkus:dev
```
Starting kafka messaging
```
cd message-kafka
mvn compile quarkus:dev
```

### Additional commands

How to start Kafka

```
cd /Users/ideltuva/workspace/kafka/kafka_2.12-2.1.1

bin/zookeeper-server-start.sh config/zookeeper.properties
bin/kafka-server-start.sh config/server.properties --override listeners=PLAINTEXT://0.0.0.0:9092 --override advertised.listeners=PLAINTEXT://localhost:9092
```

Topic creation could be run via `create_topics.sh` (unix) and `create_topics.bat` (windows) commands.