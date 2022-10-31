package com.board.justboard.dto;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
public class SignUpDto {
    @NotBlank
    @Email
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String passwordCheck;
    @NotBlank
    private String nickname;

    public SignUpDto (String username, String password, String passwordCheck, String nickname){
        this.username = username;
        this.password = password;
        this.passwordCheck = passwordCheck;
        this.nickname = nickname;
    }
}
