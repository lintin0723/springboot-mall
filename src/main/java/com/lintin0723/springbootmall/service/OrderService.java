package com.lintin0723.springbootmall.service;

import com.lintin0723.springbootmall.dto.CreateOrderRequest;
import com.lintin0723.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
