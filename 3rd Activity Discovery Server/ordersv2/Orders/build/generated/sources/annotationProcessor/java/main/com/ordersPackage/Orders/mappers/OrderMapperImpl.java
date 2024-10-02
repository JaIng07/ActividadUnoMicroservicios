package com.ordersPackage.Orders.mappers;

import com.ordersPackage.Orders.dto.OrderDto;
import com.ordersPackage.Orders.dto.OrderToSaveDto;
import com.ordersPackage.Orders.entity.Order;
import com.ordersPackage.Orders.entity.OrderState;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-01T21:49:20-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderDto orderEntityToOrderDto(Order order) {
        if ( order == null ) {
            return null;
        }

        Long id = null;
        Long userID = null;
        Long productID = null;
        Integer quantity = null;
        OrderState status = null;

        id = order.getId();
        userID = order.getUserID();
        productID = order.getProductID();
        quantity = order.getQuantity();
        status = order.getStatus();

        OrderDto orderDto = new OrderDto( id, userID, productID, quantity, status );

        return orderDto;
    }

    @Override
    public Order orderDtoToOrderEntity(OrderDto orderDto) {
        if ( orderDto == null ) {
            return null;
        }

        Order.OrderBuilder order = Order.builder();

        order.id( orderDto.id() );
        order.userID( orderDto.userID() );
        order.productID( orderDto.productID() );
        order.quantity( orderDto.quantity() );
        order.status( orderDto.status() );

        return order.build();
    }

    @Override
    public OrderToSaveDto orderEntityToOrderToSaveDto(Order order) {
        if ( order == null ) {
            return null;
        }

        Long id = null;
        Long userID = null;
        Long productID = null;
        Integer quantity = null;
        OrderState status = null;

        id = order.getId();
        userID = order.getUserID();
        productID = order.getProductID();
        quantity = order.getQuantity();
        status = order.getStatus();

        OrderToSaveDto orderToSaveDto = new OrderToSaveDto( id, userID, productID, quantity, status );

        return orderToSaveDto;
    }

    @Override
    public Order orderToSaveDtoToOrderEntity(OrderToSaveDto orderToSaveDto) {
        if ( orderToSaveDto == null ) {
            return null;
        }

        Order.OrderBuilder order = Order.builder();

        order.id( orderToSaveDto.id() );
        order.userID( orderToSaveDto.userID() );
        order.productID( orderToSaveDto.productID() );
        order.quantity( orderToSaveDto.quantity() );
        order.status( orderToSaveDto.status() );

        return order.build();
    }
}
