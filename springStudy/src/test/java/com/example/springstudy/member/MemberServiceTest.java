package com.example.springstudy.member;

import com.example.springstudy.service.member.MemberService;
import com.example.springstudy.service.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    private final MemberService memberService = new MemberServiceImpl();

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
