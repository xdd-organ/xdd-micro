package com.java.xdd.eureka.controller;

import org.springframework.stereotype.Component;

@Component
public class TestRemoteInterfaceHystric implements TestRemoteInterface{
    @Override
    public String test() {
        return "error";
    }
}
