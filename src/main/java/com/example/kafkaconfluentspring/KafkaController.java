package com.example.kafkaconfluentspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducerService prod;

    @GetMapping("/deneme")
    public void sendMessage()
    {
        prod.producerMessage("deneme");
    }
}
