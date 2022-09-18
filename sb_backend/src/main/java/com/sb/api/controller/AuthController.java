package com.sb.api.controller;

import com.sb.api.service.UserDetailsImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class AuthController {

    private final UserDetailsImpl authService;

    @PostMapping("/signup")
    public String signup() {

        return null;
    }

    @PostMapping("/signin")
    public String signin() {
        return null;
    }


}
