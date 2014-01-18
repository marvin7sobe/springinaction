package com.springinaction.anotated.aop;

import org.springframework.stereotype.Component;

@Component
public class PerformerAnnotated {

    public void perform(){
        System.out.println("Annotated perform is executed "+this);
    }
}
