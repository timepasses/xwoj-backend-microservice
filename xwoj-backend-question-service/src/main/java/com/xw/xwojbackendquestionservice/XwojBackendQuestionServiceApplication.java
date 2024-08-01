package com.xw.xwojbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.xw.xwojbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.xw")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.xw.xwojbackendserviceclient.service"})
public class XwojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(XwojBackendQuestionServiceApplication.class, args);
    }

}
