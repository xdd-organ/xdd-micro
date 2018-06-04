package com.java.xdd.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestRemoteInterface testRemoteInterface;

    @RequestMapping("test")
    public String test() {
        return testRemoteInterface.test();
    }
}
