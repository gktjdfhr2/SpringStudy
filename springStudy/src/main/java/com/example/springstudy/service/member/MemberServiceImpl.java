package com.example.springstudy.service.member;

import com.example.springstudy.member.Member;
import com.example.springstudy.repository.MemberRepository;
import com.example.springstudy.repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
