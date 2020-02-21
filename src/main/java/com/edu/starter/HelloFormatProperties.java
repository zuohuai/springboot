package com.edu.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix= HelloFormatProperties.HELLO_FORMAT_PREFIX)
public class HelloFormatProperties {

    public static final String HELLO_FORMAT_PREFIX = "hello.format";


    private Map<String, Object> info ;

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }
}
