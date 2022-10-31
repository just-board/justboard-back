package com.board.justboard.service;

import com.board.justboard.dto.SignUpDto;
import com.board.justboard.entity.Member;
import com.board.justboard.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public String SignUp(SignUpDto signUpDto){
        Member member = Member.builder()
                .username(signUpDto.getUsername())
                .password(signUpDto.getPassword())
                .nickname(signUpDto.getNickname())
                .build();

        memberRepository.save(member);
        return "회원가입 성공!";
    }
}
