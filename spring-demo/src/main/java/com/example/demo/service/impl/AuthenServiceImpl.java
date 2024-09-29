package com.example.demo.service.impl;

import com.example.demo.model.dto.LoginReq;
import com.example.demo.model.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.AuthenService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;

@Data
@Component
public class AuthenServiceImpl implements AuthenService {

    private final UserRepository userRepository;
    @Override
    public void login(LoginReq req) {
        User optUsr = userRepository.findByUsername(req.getUsername()).orElseThrow(NoSuchElementException::new);
        return;
    }
}
