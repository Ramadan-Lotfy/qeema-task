package com.codewithramadan.qeematask.dto;

import java.util.List;

public record CreateOrderDto(
        Long orderId,
        double totalAmount,
        CustomerDto customer,
        List<OrderDetailsDto> orderDetails

) {
}
