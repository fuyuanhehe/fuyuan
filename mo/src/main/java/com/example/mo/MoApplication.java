package com.example.mo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //激活对配置中心的请立即获取iTunes
public class MoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoApplication.class, args);
    }
}
