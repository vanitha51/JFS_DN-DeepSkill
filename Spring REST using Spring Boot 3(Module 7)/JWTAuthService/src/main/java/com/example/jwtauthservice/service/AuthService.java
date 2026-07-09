package com.example.jwtauthservice.service;

import org.springframework.stereotype.Service;

import com.example.jwtauthservice.model.LoginRequest;
import com.example.jwtauthservice.util.JwtUtil;

@Service
public class AuthService {

    public String authenticate(LoginRequest request) {

        if ("admin".equals(request.getUsername())
                && "admin123".equals(request.getPassword())) {

            return JwtUtil.generateToken(request.getUsername());
        }

        return "Invalid Username or Password";
    }
}