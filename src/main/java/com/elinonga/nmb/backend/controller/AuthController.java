package com.elinonga.nmb.backend.controller;

import com.elinonga.nmb.backend.dto.AuthResponse;
import com.elinonga.nmb.backend.dto.LoginRequest;
import com.elinonga.nmb.backend.model.User;
import com.elinonga.nmb.backend.repository.UserRepository;
import com.elinonga.nmb.backend.security.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired private UserRepository userRepository;
    @Autowired private JwtService jwtService;

    @PostMapping("/login-pin")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        User user = userRepository.findByPhoneNumber(request.getPhoneNumber());

        if (user == null || !BCrypt.checkpw(request.getPin(), user.getPinHash())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }

        String token = jwtService.generateToken(user);
        return ResponseEntity.ok(new AuthResponse(token));
    }
}
