package com.edu.third;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EableCacheDefination
public class EableDemoMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext cc = SpringApplication.run(EableDemoMain.class, args);
        System.out.println(cc.getBean(CacheService.class));
        System.out.println(cc.getBean(LoggerService.class));
    }
}
