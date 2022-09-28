package com.example.springstudy.config;

import com.example.springstudy.discount.DiscountPolicy;
import com.example.springstudy.discount.FixDiscountPolicy;
import com.example.springstudy.discount.RateDiscountPolicy;
import com.example.springstudy.repository.MemberRepository;
import com.example.springstudy.repository.MemoryMemberRepository;
import com.example.springstudy.service.member.MemberService;
import com.example.springstudy.service.member.MemberServiceImpl;
import com.example.springstudy.service.order.OrderService;
import com.example.springstudy.service.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }



}
