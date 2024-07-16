package com.JinjH.Huaojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.JinjH.Huaojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.JinjH")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.JinjH.Huaojbackendserviceclient.service"})
public class HuaojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuaojBackendUserServiceApplication.class, args);
    }

}
