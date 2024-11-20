package com.api.order_ms.models.response;

import org.springframework.data.domain.Page;

public record PaginationResponse(
        Integer page,
        Integer size,
        Long totalElements,
        Integer totalPages) {

    public static PaginationResponse fromPage(Page<?> page) {
        return new PaginationResponse(
                page.getNumber(),
                page.getSize(),
                page.getTotalElements(),
                page.getTotalPages()
        );
    }
}