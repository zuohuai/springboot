package com.edu.starter;

import com.alibaba.fastjson.JSON;

public class JsonFormaterProcessor implements FormaterProcessor{

    @Override
    public <T> String format(T obj) {
        return "JsonFormaterProcessor-"+JSON.toJSONString(obj);
    }
}
