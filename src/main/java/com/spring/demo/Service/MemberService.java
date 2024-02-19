package com.spring.demo.Service;

import com.spring.demo.model.Member;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MemberService
{
    private Map<Long, Member> memberMap = new HashMap<>();

    public Member createMember(Member member){

        // call the database
        Long memberId = new Random().nextLong();
        member.setMemberId(memberId);
        memberMap.put(memberId, member);
        return  member;
    }

    public Member getMember(Long memberId) {
        return memberMap.get(memberId);

    }
}
