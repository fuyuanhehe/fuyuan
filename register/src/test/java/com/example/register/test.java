package com.example.register;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class test {
    // @Value("${resource.id:spring-boot-application}")
    @Value("${www.xx}")
    private String name;


    @PostConstruct
    public void t1(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println(name);
        }

    }
}
