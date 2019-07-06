package com.wisely.highlig_spring4.ch2.scope;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Scope;

@Service
@Scope("prototype")
public class DemoPrototypeService {
}
