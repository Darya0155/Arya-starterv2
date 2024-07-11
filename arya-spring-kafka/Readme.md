## create topic
```bash
docker exec --interactive --tty kafka1  kafka-topics --bootstrap-server kafka1:19092 --create  --topic __consumer_offsets --replication-factor 1 --partitions 3
```