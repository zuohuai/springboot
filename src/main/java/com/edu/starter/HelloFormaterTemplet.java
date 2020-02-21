package com.edu.starter;

public class HelloFormaterTemplet {

    private FormaterProcessor formaterProcessor;

    private HelloFormatProperties helloFormatProperties;

    HelloFormaterTemplet(FormaterProcessor formaterProcessor, HelloFormatProperties helloFormatProperties){
        this.formaterProcessor = formaterProcessor;
        this.helloFormatProperties = helloFormatProperties;
    }

    public <T> void printFormatValue(T object){
        System.out.println("helloFormatProperties:"+ helloFormatProperties);
        System.out.println(formaterProcessor.format(object));
    }

}
