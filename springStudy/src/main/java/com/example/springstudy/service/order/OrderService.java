package com.example.springstudy.service.order;

import com.example.springstudy.order.Order;

public interface OrderService {
    Order createOrder(Long memeberId, String itemName, int itemPrice);


}
