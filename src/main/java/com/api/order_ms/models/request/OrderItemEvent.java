package com.api.order_ms.models.request;

import java.math.BigDecimal;

public record OrderItemEvent(
        String product,
        Integer quantity,
        BigDecimal price) {}