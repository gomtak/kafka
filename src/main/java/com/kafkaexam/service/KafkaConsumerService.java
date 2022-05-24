package com.kafkaexam.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "TOPIC-NEWS", containerFactory = "concurrentKafkaListenerContainerFactory")
    public void consume(Object obj) {
        System.out.println(obj.toString());
    }
}