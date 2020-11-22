package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {


    @Value("${demo.config-value}")
    private static String configValue;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println(new ConfigReadTest().getConfigValue());
        System.out.println(configValue);
    }


}
