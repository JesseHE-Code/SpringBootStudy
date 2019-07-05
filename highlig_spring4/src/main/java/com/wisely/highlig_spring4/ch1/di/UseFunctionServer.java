package com.wisely.highlig_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UseFunctionServer {
    @Autowired
    FunctionServer functionserver;


    public String SayHello(String world) {
        return functionserver.sayHello(world);
    }
}
