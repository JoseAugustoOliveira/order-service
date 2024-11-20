package com.api.order_ms.models.request;

import java.util.List;

public record OrderCreatedEvent(
        Long orderCode,
        Long orderClient,
        List<OrderItemEvent> items) {}