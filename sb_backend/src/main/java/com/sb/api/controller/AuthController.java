package com.sb.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class AuthController {


    @PostMapping("/signup")
    public String signup() {

        return null;
    }

    @PostMapping("/signin")
    public String signin() {
        return null;
    }


}
