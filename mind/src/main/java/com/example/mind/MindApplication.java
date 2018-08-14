package com.example.mind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy // wangguan
public class MindApplication {

    public static void main(String[] args) {
        SpringApplication.run(MindApplication.class, args);
    }
    
    
    
    @Bean
    public TokenFilter tokenFilter() {
    	return new TokenFilter();
    }
}
