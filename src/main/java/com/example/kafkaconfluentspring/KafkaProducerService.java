package com.example.kafkaconfluentspring;

import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;

@Service
public class KafkaProducerService {

    private KafkaTemplate<String,String> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String,String> kafkaTemplate)
    {
        this.kafkaTemplate=kafkaTemplate;
    }

    public void producerMessage(String message)
    {
        kafkaTemplate.send("test",message);
    }
}
