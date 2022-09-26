package com.example.springstudy.service.order;

public interface OrderService {
    Order createOrder(Long memeberId, String itemName, int itemPrice);


}
