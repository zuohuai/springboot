package com.edu.starter;

import java.util.Objects;

public class StringFormaterProcessor implements FormaterProcessor{

    @Override
    public <T> String format(T obj){
        return "StringFormaterProcessor-" + Objects.toString(obj);
    }
}
