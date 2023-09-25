package com.example.consumerkafkademo.listener;

import com.example.consumerkafkademo.dto.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ConsumerListener {

    @KafkaListener(topics = "quickstart-events")
    public void consume(ConsumerRecord<String, Product> message){
        System.out.println(message.value());
    }
}
