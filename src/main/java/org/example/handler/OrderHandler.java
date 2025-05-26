package org.example.handler;

import lombok.extern.slf4j.Slf4j;
import org.example.model.UserOrderDto;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderHandler {

    @KafkaListener(topics = "${kafka.topic.order-created}", groupId = "order-service-group")
    void getOrder(UserOrderDto userOrderDto) {
        log.info("message received");

    }
}
