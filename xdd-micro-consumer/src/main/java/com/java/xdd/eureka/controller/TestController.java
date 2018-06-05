package com.java.xdd.eureka.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestRemoteInterface testRemoteInterface;

    @RequestMapping("test")
    @HystrixCommand(fallbackMethod = "hiError")
    public String test() {
        return testRemoteInterface.test();
    }

    public String hiError() {
        return "sorry,error!";
    }
}
