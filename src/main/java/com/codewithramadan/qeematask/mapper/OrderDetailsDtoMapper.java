package com.codewithramadan.qeematask.mapper;

import com.codewithramadan.qeematask.dto.OrderDetailsDto;
import com.codewithramadan.qeematask.models.OrderDetails;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class OrderDtoMapper implements Function<OrderDetailsDto, OrderDetails> {
    @Override
    public OrderDetails apply(OrderDetailsDto orderDetailsDto) {
        return null;
    }
}
