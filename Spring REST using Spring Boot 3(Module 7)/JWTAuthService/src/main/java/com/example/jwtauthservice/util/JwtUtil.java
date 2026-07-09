package com.example.jwtauthservice.util;

import java.security.Key;
import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JwtUtil {

    private static final Key KEY =
            Keys.hmacShaKeyFor("mysecretkeymysecretkeymysecretkey12".getBytes());

    public static String generateToken(String username) {

        return Jwts.builder()
        		.setSubject(username)
        		.setIssuedAt(new Date())
        		.setExpiration(new Date(System.currentTimeMillis() + 3600000))
        		.signWith(KEY, io.jsonwebtoken.SignatureAlgorithm.HS256)
                .compact();
    }
}