package com.kafkaexam;

import lombok.Data;
import org.springframework.lang.NonNullFields;

@Data
public class Entity {
    private String name;
    private String message;
}
