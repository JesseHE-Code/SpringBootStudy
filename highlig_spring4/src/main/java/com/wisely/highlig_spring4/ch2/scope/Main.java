package com.wisely.highlig_spring4.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSigletonService s1 = context.getBean(DemoSigletonService.class);
        DemoSigletonService s2 = context.getBean(DemoSigletonService.class);

        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

        System.out.println("s1 与 s2 是否相等：" + s1.equals(s2));
        System.out.println("p1 与 p2 是否相等：" + p1.equals(p2));

        
        context.close();

    }
}
