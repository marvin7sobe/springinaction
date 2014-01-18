package com.springinaction.corebyxml.autowiring;


public class Car {
    private String name;
    private Bamper bamper;

    public Car() {}

    public Car(Bamper bamper) {
        setBamper(bamper);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bamper getBamper() {
        return bamper;
    }

    public void setBamper(Bamper bamper) {
        this.bamper = bamper;
        System.out.println("For car: "+name+" bamper is set, color:"+bamper.getColor());
    }
}
