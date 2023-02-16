# kafka-template

## Commands
``` 
After installing with Hombrew

Start Kafka Zookeeper
$: zookeeper-server-start /opt/homebrew/etc/kafka/zookeeper.properties

Start Kafka Broker
$: kafka-server-start /opt/homebrew/etc/kafka/server.properties

Start Kafka Consumer
$: kafka-console-consumer --bootstrap-server localhost:9092 --topic <topic-name> --from-beginning
```