package com.springinaction.anotated.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class PerformExecutorAnnotated {

    @Autowired
    public PerformerAnnotated performer;

    @PostConstruct
    public void makeConcert(){
        performer.perform();
    }

    public PerformerAnnotated getPerformer() {
        return performer;
    }

    public void setPerformer(PerformerAnnotated performer) {
        this.performer = performer;
    }
}
