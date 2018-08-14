package com.example.producer2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	private final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
    	
    	   logger.info("调用提供者2,哈哈"+name);
    	   
    	try{
            Thread.sleep(100000000);
        }catch ( Exception e){
        	System.err.println("异常-------------"+name);
        }
    	
        return "hello "+name+",我是提供者2";
    }
}