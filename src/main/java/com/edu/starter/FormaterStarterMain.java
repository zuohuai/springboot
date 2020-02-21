package com.edu.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FormaterStarterMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext cc = SpringApplication.run(FormaterStarterMain.class, args);
        HelloFormaterTemplet helloFormaterTemplet = cc.getBean(HelloFormaterTemplet.class);
        helloFormaterTemplet.printFormatValue("nice to meet  you");
    }

}
