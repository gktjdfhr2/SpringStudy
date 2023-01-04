package com.example.springstudy.discount;

import com.example.springstudy.eNum.Grade;
import com.example.springstudy.member.Member;
import org.springframework.stereotype.Component;

@Component
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountRateAmmount;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            discountRateAmmount = (int)(price *  0.1);
            return discountRateAmmount;
        }else return 0;
    }
}
