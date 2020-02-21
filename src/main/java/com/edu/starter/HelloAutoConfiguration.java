package com.edu.starter;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(FormaterAutoConfiguration.class)
@Configuration
@EnableConfigurationProperties(HelloFormatProperties.class)
public class HelloAutoConfiguration {


    @Bean
    HelloFormaterTemplet helloFormaterTemplet(FormaterProcessor formaterProcessor, HelloFormatProperties helloFormatProperties){
        return new HelloFormaterTemplet(formaterProcessor, helloFormatProperties);
    }
}
