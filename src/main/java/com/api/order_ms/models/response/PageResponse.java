package com.api.order_ms.models.response;

import java.util.List;
import java.util.Map;

public record PageResponse<T>(
        Map<String, Object> summary,
        List<T> data,
        PaginationResponse pagination) {}