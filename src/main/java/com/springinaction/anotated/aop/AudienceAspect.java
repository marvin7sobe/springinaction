package com.springinaction.anotated.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AudienceAspect {

    @Pointcut("execution(* com.springinaction.anotated.aop.PerformerAnnotated.perform())")
    public void performPointCut(){}

    @Before("performPointCut()")
    public void takeSeats() {
        System.out.println("Annotated audience is taking their seats.");
    }

    @Before("performPointCut()")
    public void turnOffCellPhones() {
        System.out.println("Annotated audience is turning off their cellphones");
    }

    @After("performPointCut()")
    public void applaud() {
        System.out.println("Annotated CLAP CLAP CLAP CLAP CLAP");
    }

    @AfterThrowing("performPointCut()")
    public void demandRefund() {
        System.out.println("Annotated Boo! We want our money back!");
    }

    @Around("performPointCut()")
    public void watchPerformance(ProceedingJoinPoint joinpoint) {
        try {
            System.out.println("Annotated Around - Before perform is executed");
            long start = System.currentTimeMillis();

            joinpoint.proceed();

            long end = System.currentTimeMillis();
            System.out.println("Annotated Around - After perform is executed");
            System.out.println("Annotated The performance took " + (end - start) + " milliseconds.");
        } catch (Throwable t) {
            System.out.println("Annotated Boo! We want our money back!");
        }
    }
}
