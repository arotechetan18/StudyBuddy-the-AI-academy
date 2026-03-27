package com.studybuddy.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.studybuddy.dto.LoginRequest;
import com.studybuddy.dto.LoginResponse;
import com.studybuddy.Services.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {

        String token = authService.login(request);

        return new LoginResponse(token);
    }
}