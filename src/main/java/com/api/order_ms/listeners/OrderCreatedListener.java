package com.api.order_ms.listeners;

import com.api.order_ms.models.request.OrderCreatedEvent;
import com.api.order_ms.services.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import static com.api.order_ms.configs.RabbitMqConfig.ORDER_CREATED_QUEUE;

@Slf4j
@Component
@RequiredArgsConstructor
public class OrderCreatedListener {

    private final OrderService orderService;

    @RabbitListener(queues = ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEvent> message) {
        log.info("Message consumed {}: ", message);

        orderService.save(message.getPayload());
    }
}
