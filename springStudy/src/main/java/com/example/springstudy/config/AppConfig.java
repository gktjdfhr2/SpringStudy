package com.example.springstudy.config;

import com.example.springstudy.discount.FixDiscountPolicy;
import com.example.springstudy.repository.MemoryMemberRepository;
import com.example.springstudy.service.member.MemberService;
import com.example.springstudy.service.member.MemberServiceImpl;
import com.example.springstudy.service.order.OrderService;
import com.example.springstudy.service.order.OrderServiceImpl;


public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }



}
