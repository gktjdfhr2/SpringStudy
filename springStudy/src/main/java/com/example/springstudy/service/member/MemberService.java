package com.example.springstudy.service.member;

import com.example.springstudy.member.Member;

public interface MemberService {
    void join(Member member);

    Member findMember(Long memberId);
}
