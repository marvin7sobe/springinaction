package com.springinaction.corebyxml.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

    public void takeSeats() {
        System.out.println("The audience is taking their seats.");
    }

    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }

    public void applaud() {
        System.out.println("CLAP CLAP CLAP CLAP CLAP");
    }

    public void demandRefund() {
        System.out.println("Boo! We want our money back!");
    }

    public void watchPerformance(ProceedingJoinPoint joinpoint) {
        try {
            System.out.println("Around - Before perform is executed");
            long start = System.currentTimeMillis();

            joinpoint.proceed();

            long end = System.currentTimeMillis();
            System.out.println("Around - After perform is executed");
            System.out.println("The performance took " + (end - start) + " milliseconds.");
        } catch (Throwable t) {
            System.out.println("Boo! We want our money back!");
        }
    }
}
