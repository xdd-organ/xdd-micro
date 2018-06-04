package com.java.xdd.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient         //eureka使用该注解
//@EnableDiscoveryClient    其他注册中心这个该注解，功能是一样的
public class EurekaProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProducerApplication.class, args);
    }
}
