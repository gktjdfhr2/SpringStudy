package com.example.springstudy.discount;

import com.example.springstudy.eNum.Grade;
import com.example.springstudy.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return discountFixAmmount;
        } else return 0;
    }
}
