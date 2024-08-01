package com.xw.xwojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.xw.xwojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.xw")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.xw.xwojbackendserviceclient.service"})
public class XwojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(XwojBackendUserServiceApplication.class, args);
    }

}
