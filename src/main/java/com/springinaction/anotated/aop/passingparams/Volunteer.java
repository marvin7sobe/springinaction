package com.springinaction.anotated.aop.passingparams;

import org.springframework.stereotype.Component;

@Component
public class Volunteer {

    private String thoughts;

    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }
}
