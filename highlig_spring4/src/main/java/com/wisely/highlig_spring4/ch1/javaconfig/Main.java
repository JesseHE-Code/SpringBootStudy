package com.wisely.highlig_spring4.ch1.javaconfig;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        UseFunctionServer usefunctionserver = context.getBean(UseFunctionServer.class);
        System.out.println(usefunctionserver.SayHello(" World!"));
        context.close();
    }
}
