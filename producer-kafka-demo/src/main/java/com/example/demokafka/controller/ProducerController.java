package com.example.demokafka.controller;

import com.example.demokafka.dto.Product;
import com.example.demokafka.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("producer")
@Controller
public class ProducerController {

    @Autowired
    ProducerService producerService;

    @GetMapping
    public String  healthCheck(@RequestBody String message){
        producerService.sendMessage(message);
        return "OK";
    }

    @PostMapping
    public Product sendProduct(@RequestBody Product product){
        producerService.sendMessage(product);
        return product;
    }
}
