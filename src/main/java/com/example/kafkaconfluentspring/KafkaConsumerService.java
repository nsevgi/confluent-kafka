package com.example.kafkaconfluentspring;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

   // @KafkaListener(topics="test",groupId = "myGroup")
    public void onConsumerMessage(String message)
    {
        System.out.println(message);
    }
}
