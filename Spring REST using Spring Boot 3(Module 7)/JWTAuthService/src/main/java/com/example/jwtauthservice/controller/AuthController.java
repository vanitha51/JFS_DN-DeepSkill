package com.example.jwtauthservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.jwtauthservice.model.LoginRequest;
import com.example.jwtauthservice.service.AuthService;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/authenticate")
    public String authenticate(@RequestBody LoginRequest request) {

        return authService.authenticate(request);
    }
}