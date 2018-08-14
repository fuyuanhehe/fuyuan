package com.example.producer2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
    	System.out.println("调用提供者2,哈哈");
    	
    	try{
            Thread.sleep(100000000);
        }catch ( Exception e){
        }
    	
        return "hello "+name+",我是提供者2";
    }
}