package com.edu.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {
    @Bean
    DemoClass newDemoClass(){
        return new DemoClass();
    }
}
