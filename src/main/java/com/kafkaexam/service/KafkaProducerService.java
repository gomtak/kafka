package com.kafkaexam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    @Autowired
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    //주문 관련된 메시지
    public void sendExecuteMessage(Object data) {
        Message<Object> executeMessage = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "minting")
                .build();
        kafkaTemplate.send(executeMessage);
    }
}
