package com.edu.second.current;

import com.edu.config.DemoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SecondMain {

    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] nameArr = applicationContext.getBeanDefinitionNames();
        for(String name : nameArr){
            System.out.println(name);
        }
    }
}
