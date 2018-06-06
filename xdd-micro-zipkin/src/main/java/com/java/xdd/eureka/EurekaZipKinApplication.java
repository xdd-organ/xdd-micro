package com.java.xdd.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class EurekaZipKinApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaZipKinApplication.class, args);
    }
}
