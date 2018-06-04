package com.java.xdd.eureka.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient("xdd-producer")
public interface TestRemoteInterface {
    @RequestMapping("test/test")
    String test();
}
