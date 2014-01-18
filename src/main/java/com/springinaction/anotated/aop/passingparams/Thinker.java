package com.springinaction.anotated.aop.passingparams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Thinker {

    @Autowired
    private Volunteer volunteer;

    @PostConstruct
    public void think() {
        volunteer.thinkOfSomething("I want to be a super man");
    }
}
