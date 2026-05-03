package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/login-test")
    public String loginTest() {
        return "로그인 서버가 준비되었습니다!";
    }
}