package com.lintin0723.springbootmall.service;

import com.lintin0723.springbootmall.dto.CreateOrderRequest;
import com.lintin0723.springbootmall.dto.OrderQueryParams;
import com.lintin0723.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
