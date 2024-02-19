package com.spring.demo.Controller;

import com.spring.demo.Service.MemberService;
import com.spring.demo.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController
{
    @Autowired
    private MemberService memberService;

    @GetMapping
    public Member getMember(Long memberId){
        return memberService.getMember(memberId);
    }

    // create a member
    @PostMapping
    public Member createMember(@RequestBody Member member){
        return memberService.createMember(member);
    }
}
