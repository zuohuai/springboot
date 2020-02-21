package com.edu.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoConfigurationMain {

    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoConfiguration.class);
        DemoClass demoClass = applicationContext.getBean(DemoClass.class);
        demoClass.sayHello();;
    }
}
