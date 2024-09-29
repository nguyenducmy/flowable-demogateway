package com.example.demo.service;

import com.example.demo.model.dto.RegistCardDto;
import org.flowable.engine.runtime.ProcessInstance;

public interface FlowService {
    public ProcessInstance initiateFlow(RegistCardDto registCardDto);

    void complete(String id);
}
