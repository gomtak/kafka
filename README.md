### kafka 테스트 레포

# kafka window 테스트시 ( 카프카 폴더 /bin/windows 에서 실행 )

## zookeeper 실행 
* .\zookeeper-server-start.bat ..\..\config\zookeeper.properties
## kafka 서버 실행 
* .\kafka-server-start.bat ..\..\config\server.properties
## kafka 토픽 생성
* .\kafka-topics.bat --create --bootstrap-server localhost:9092 --topic {{토픽이름}}
## Kafka 토픽에 메세지 전송
* .\kafka-console-producer.bat  --broker-list  localhost:9092 --topic order
## kafka 토픽 확인
* 시작부터 지금까지 내용 확인.
* .\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic {{토픽이름}} --from-beginning
