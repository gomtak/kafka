package com.kafkaexam.service;

import com.kafkaexam.Entity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "order", containerFactory = "concurrentKafkaListenerContainerFactory")
    public void consume(Entity entity) {
        System.out.println(entity.toString());
    }
}