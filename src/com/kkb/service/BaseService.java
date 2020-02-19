package com.kkb.service;


// Currently I want to implement multi-level agent, for 螳螂扑蝉，黄雀在后： Mantis flapping cicada, The yellow sparrow comes after the praying mantis

// 1. firstly need to create a baseService to list all the behavior which need to be watched

// 2. Secondly , I need to implement the serviceImpl , I need to have the main tasks,  cicada need to be watched , and it is the main task

// 3. thridly, I need to create a proxyObject, which should be watched by the agent, this proxy object is the fake cicada, and the returned type is also BaseService

// 4. implement the agent,there are 2 agents: 实现次要业务， 以及主要业务和次要业务的绑定
public interface BaseService{
    public void eat();
    
}
