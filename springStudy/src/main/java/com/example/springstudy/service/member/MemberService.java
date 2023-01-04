package com.example.springstudy.service.member;

import com.example.springstudy.member.Member;
import org.springframework.stereotype.Component;

@Component
public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
