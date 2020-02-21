package com.edu.second.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtherConfig {

    @Bean
    OtherBean otherBean(){
        return new OtherBean();
    }
}
