package com.microservicios.actividaddosmicroservicios.orders.src.main.java.com.ordersPackage.Orders.dto;

import com.microservicios.actividaddosmicroservicios.orders.src.main.java.com.ordersPackage.Orders.entity.OrderState;

public record OrderToSaveDto(
        Long id,
        Long userID,
        Long productID,
        Integer quantity,
        OrderState status
) {
}
