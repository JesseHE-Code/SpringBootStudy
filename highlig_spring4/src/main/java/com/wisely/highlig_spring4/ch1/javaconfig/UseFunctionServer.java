package com.wisely.highlig_spring4.ch1.javaconfig;

import com.wisely.highlig_spring4.ch1.di.FunctionServer;

public class UseFunctionServer {
    FunctionServer functionServer;
    public void setFunctionServer(FunctionServer functionServer){
        this.functionServer = functionServer;
    }

    public String SayHello(String world){
        return functionServer.sayHello(world);
    }
}
