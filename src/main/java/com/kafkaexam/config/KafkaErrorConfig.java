package com.kafkaexam.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.listener.KafkaListenerErrorHandler;

@Slf4j
@EnableKafka
@Configuration
public class KafkaErrorConfig {
    @Bean
    public KafkaListenerErrorHandler kafkaListenerErrorHandler() {
        return (m, e) -> {
            System.out.println("에러핸들러 도착");
//            /**
//             * error 로그 기록
//             */
//            log.error("[KafkaErrorHandler] kafkaMessage=[" + m.getPayload() + "], errorMessage=[" + e.getMessage() + "]");
//            // 메시지 가공 or 처리
//            ConsumerRecord<String, String> record = (ConsumerRecord<String, String>) m.getPayload();

            return m;  // sendTo("토픽명")에 입력된 토픽으로 전달 될 메시지 내용
        };
    }
}
