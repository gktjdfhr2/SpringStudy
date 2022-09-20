package com.example.springstudy.repository;

import com.example.springstudy.member.Member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
