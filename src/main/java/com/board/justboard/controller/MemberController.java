package com.board.justboard.controller;

import com.board.justboard.dto.SignUpDto;
import com.board.justboard.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/members")
@RestController
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/signup")
    public String SignUp(@RequestBody SignUpDto signUpDto){
        if(signUpDto.getUsername().equals("") ||
                signUpDto.getPassword().equals("") ||
                signUpDto.getPasswordCheck().equals("") ||
                signUpDto.getNickname().equals("")){
            return "입력하지 않은 항목이 있습니다.";
        }

        if(!signUpDto.getPassword().equals(signUpDto.getPasswordCheck())){
            return "비밀번호가 일치하지 않습니다.";
        }

        return memberService.SignUp(signUpDto);
    }
}
