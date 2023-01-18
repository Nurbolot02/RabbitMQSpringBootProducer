package com.ntg.rabbitmqspringbootproducer.controller;

import com.ntg.rabbitmqspringbootproducer.model.MessageModel;
import com.ntg.rabbitmqspringbootproducer.service.abstracts.RabbitMQProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RabbitMQController {
    private final RabbitMQProducerService rabbitMQProducerService;
    @GetMapping("/send")
    public void sendMessageToRabbitMQ(@RequestBody MessageModel messageModel){
        rabbitMQProducerService.sendMessage(messageModel.getMessage(), messageModel.getRoutingKey());
    }

    @GetMapping("/health")
    public String health(){
        return "ok";
    }
}
