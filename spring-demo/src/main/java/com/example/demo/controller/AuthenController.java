package com.example.demo.controller;

import com.example.demo.model.dto.LoginReq;
import com.example.demo.model.dto.UserDto;
import com.example.demo.model.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.AuthenService;
import jdk.jfr.Registered;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class AuthenController {
    private final AuthenService authenService;
    private final UserRepository userRepository;

    @PostMapping("/login")
    public String login(@RequestBody LoginReq req) {
        // add log
        authenService.login(req);
        log.info("login success");
        return "login";
    }
}
