package com.wisely.highlig_spring4.ch1.javaconfig;

import com.wisely.highlig_spring4.ch1.di.FunctionServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class JavaConfig {
    @Bean
    public FunctionServer functionServer(){
        return new FunctionServer();
    }

    @Bean
    public UseFunctionServer useFunctionServer(){
        UseFunctionServer useFunctionServer = new UseFunctionServer();
        useFunctionServer.setFunctionServer(functionServer());
        return useFunctionServer;
    }

}
