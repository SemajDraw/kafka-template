package com.kafkatemplate.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerTemplate {

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.listener.groupId}")
    void listener(String data) {
        System.out.println("Message: " + data);
    }
}
