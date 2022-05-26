package com.kafkaexam;

import com.kafkaexam.service.KafkaConsumerService;
import com.kafkaexam.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/kafka")
public class TestController {

    @Autowired
    KafkaProducerService kafkaProducerService;
    @Autowired
    KafkaConsumerService kafkaConsumerService;

    @PostMapping
    public void sendMessage(@RequestBody Entity entity){
        System.out.println("보내기전 확인");
        System.out.println(entity.toString());
        kafkaProducerService.sendExecuteMessage(entity);
    }
}
