package com.example.prove.procider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
    	
    	System.out.println("调用提供者");
    	
        return "hello "+name+",我是提供者";
    }
}