package com.kkb.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.kkb.service.BaseService;

public class MantisAgent implements InvocationHandler {

    private BaseService obj;
    public MantisAgent(BaseService param) {this.obj = param;};
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String mth = method.getName();
        if("eat".equals(mth)){
            method.invoke(obj, args);
            featchCicada();
        }
        return null;
    }
    
    public void featchCicada(){
        System.out.println("Mantis flapping cicada");
    }
    
}
