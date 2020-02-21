package com.edu.forth;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringSPIMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext cc = SpringApplication.run(SpringSPIMain.class, args);
        System.out.println(cc.getBean(ForthBean.class));
    }
}
