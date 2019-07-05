package com.wisely.highlig_spring4.ch1.di;

import org.springframework.stereotype.Service;
@Service
public class FunctionServer {
    public String sayHello(String world){
        return "Hello" + world;
    }
}
