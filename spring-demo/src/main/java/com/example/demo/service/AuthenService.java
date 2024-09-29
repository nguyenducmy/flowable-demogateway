package com.example.demo.service;

import com.example.demo.model.dto.LoginReq;
import org.springframework.stereotype.Service;

@Service
public interface AuthenService {

    void  login(LoginReq req);
}
