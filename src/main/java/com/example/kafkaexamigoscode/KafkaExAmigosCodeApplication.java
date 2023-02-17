package com.example.kafkaexamigoscode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaExAmigosCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaExAmigosCodeApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
            for (int i = 0; i < 21; i++) {
                kafkaTemplate.send("amigoscode", "Get " + i + " ready for kafka");
            }

        };
    }

}
