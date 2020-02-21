package com.edu.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class FormaterAutoConfiguration {


    @ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
    @Bean
    @Primary
    FormaterProcessor stringFormaterProcessor(){
        return new StringFormaterProcessor();
    }

    @ConditionalOnClass(name="com.alibaba.fastjson.JSON")
    @Bean
    FormaterProcessor jsonFormaterProcessor(){
        return new JsonFormaterProcessor();
    }
}
