package com.ntg.rabbitmqspringbootproducer.service.abstracts;

public interface RabbitMQProducerService {
    void sendMessage(String message, String routingKey);
}
