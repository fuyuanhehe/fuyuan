package com.example.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer   // 开启配置服务
@EnableDiscoveryClient  //注册config服务到eureka
public class ConfigApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
    
    // NB
    // 22
}
