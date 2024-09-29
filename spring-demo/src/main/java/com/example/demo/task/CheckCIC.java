package com.example.demo.task;

import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class CheckCIC implements JavaDelegate {


    @Override
    public void execute(DelegateExecution execution) {
        log.info("CheckCIC");
        System.out.println("run check CIC !!!");
    }
}
