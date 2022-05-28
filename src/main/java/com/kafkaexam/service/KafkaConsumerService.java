package com.kafkaexam.service;

import com.kafkaexam.Entity;
import org.springframework.kafka.KafkaException;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "order", containerFactory = "concurrentKafkaListenerContainerFactory", errorHandler = "kafkaListenerErrorHandler")
//    @SendTo("error")
    public void consume(Entity entity) {
        if(entity.getMessage().equals("에러")) throw new KafkaException("에러");
        System.out.println(entity.toString());
    }
//    @KafkaListener(topics = "error", groupId = "errorEndpoint")
//    public void error(Entity entity) {
//        System.out.println("에러 최종토픽 받는곳");
//        System.out.println(entity.toString());
//    }
}