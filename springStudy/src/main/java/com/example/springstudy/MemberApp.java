package com.example.springstudy;

import com.example.springstudy.member.Grade;
import com.example.springstudy.member.Member;
import com.example.springstudy.service.member.MemberService;
import com.example.springstudy.service.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new  Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());

    }
}
