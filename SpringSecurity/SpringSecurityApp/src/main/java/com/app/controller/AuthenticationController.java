package com.app.controller;

import com.app.controller.dto.AuthCreateUserRequest;
import com.app.controller.dto.AuthLoginRequest;
import com.app.controller.dto.AuthResponse;
import com.app.service.UserDetailsServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")

public class AuthenticationController {
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody @Valid AuthLoginRequest userRequest){
        return new ResponseEntity<>(this.userDetailsService.loginUser(userRequest), HttpStatus.OK);
    }

    @PostMapping("/sign-up")
    public ResponseEntity<AuthResponse> register(@RequestBody @Valid AuthCreateUserRequest authCreateUserRequest){
        return new ResponseEntity<>(this.userDetailsService.createUser(authCreateUserRequest), HttpStatus.CREATED);

    }
}
