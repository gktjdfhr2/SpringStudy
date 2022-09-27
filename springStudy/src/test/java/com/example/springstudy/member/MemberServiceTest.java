package com.example.springstudy.member;

import com.example.springstudy.config.AppConfig;
import com.example.springstudy.eNum.Grade;
import com.example.springstudy.member.Member;
import com.example.springstudy.service.member.MemberService;
import com.example.springstudy.service.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        Member finMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(finMember);
    }
}
