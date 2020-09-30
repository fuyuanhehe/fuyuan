package com.example.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.consumer.server.HelloRemote;

@RestController
public class ConsumerController {

    @Autowired
    HelloRemote HelloRemote;
	
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
    	
    	System.out.println("调用消费者");
    	
        return HelloRemote.hello(name);
    }

/*    com.netflix.loadbalancer.RandomRule #配置规则 随机
    com.netflix.loadbalancer.RoundRobinRule #配置规则 轮询
    com.netflix.loadbalancer.RetryRule #配置规则 重试
    com.netflix.loadbalancer.WeightedResponseTimeRule #配置规则 响应时间权重
    com.netflix.loadbalancer.BestAvailableRule #配置规则 最空闲连接策略
    */
}