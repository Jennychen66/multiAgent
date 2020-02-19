package com.kkb.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.kkb.service.BaseService;

public class YellowSparrowAgent implements InvocationHandler {

    private BaseService obj;
    public YellowSparrowAgent(BaseService param) {this.obj = param;};
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        
        method.invoke(obj, args);
        featchMantis();
        return null;
    }
    
    public void featchMantis(){
        System.out.println("The yellow sparrow comes after the praying mantis");
    }
    
}
