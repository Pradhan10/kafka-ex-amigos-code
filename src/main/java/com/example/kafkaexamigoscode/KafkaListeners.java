package com.example.kafkaexamigoscode;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "amigoscode", groupId = "groupTango")
    void listener(String data){
        System.out.println("Listener data : " + data);
    }
}
