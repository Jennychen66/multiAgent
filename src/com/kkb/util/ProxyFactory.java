package com.kkb.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.kkb.service.BaseService;
import com.kkb.serviceImpl.Cicada;

public class ProxyFactory{
    public static BaseService newInstance(Class class_file){
        // 需要索要的对象
        
        
        //1. 主要就是为了实现Proxy.newProxyInstance 方法
        //Proxy.newProxyInstance(loader, interfaces, h)
        //2. create the 3 params,  
        /**
         * loader, 指向被监控的类对象在内存中的地址
         * interfaces,被监控类中所实现的接口（只监控特定方法，一般会放到一个接口中，这个接口中所实现的方法就是需要被监控的主要业务行为）
         *  h, 交给代理实现类来处理
         */
        // 3. 创建代理对象
        BaseService cicada = new Cicada();
        InvocationHandler mantis_agent = new MantisAgent(cicada);
        
        // 4. 创建 interface
        Class class_array[] = {BaseService.class};
        
        BaseService proxy1 = (BaseService) Proxy.newProxyInstance(class_file.getClassLoader(), class_array, mantis_agent);
        
        InvocationHandler yellow_sparrow_agent = new YellowSparrowAgent(proxy1);
        BaseService proxy2 = (BaseService) Proxy.newProxyInstance(class_file.getClassLoader(), class_array, yellow_sparrow_agent);
        
        return proxy2;
        
    }
}
