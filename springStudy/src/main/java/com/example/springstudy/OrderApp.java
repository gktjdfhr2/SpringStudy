package com.example.springstudy;

import com.example.springstudy.config.AppConfig;
import com.example.springstudy.eNum.Grade;
import com.example.springstudy.member.Member;
import com.example.springstudy.service.member.MemberService;
import com.example.springstudy.service.order.Order;
import com.example.springstudy.service.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);




    }
}
