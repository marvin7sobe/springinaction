package com.springinaction.corebyxml.aop;


public class PerformExecutor {
    public Performer performer;

    public void makeConcert(){
        performer.perform();
    }

    public Performer getPerformer() {
        return performer;
    }

    public void setPerformer(Performer performer) {
        this.performer = performer;
    }
}
