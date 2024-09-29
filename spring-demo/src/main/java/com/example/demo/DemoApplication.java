package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//        Object bean1 = context.getBean("checkCIC");
//        Object bean2 = context.getBean("sendApprove");
//        Object bean3 = context.getBean("disbursement");
//        System.out.println(bean1.getClass().getName());


    }

}
