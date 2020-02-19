package com.kkb.test;

import com.kkb.service.BaseService;
import com.kkb.serviceImpl.Cicada;
import com.kkb.util.ProxyFactory;

public class testMain {
    public static void main(String[] args ){
        BaseService cicada = ProxyFactory.newInstance(Cicada.class);
        cicada.eat();
    }
}
