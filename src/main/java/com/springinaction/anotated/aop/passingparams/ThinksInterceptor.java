package com.springinaction.anotated.aop.passingparams;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ThinksInterceptor {

    @Pointcut("execution(* com.springinaction.anotated.aop.passingparams.Volunteer.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts){}

    @Before("thinking(thoughts)")
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts");
        System.out.println("Voluntier thinks about: "+thoughts);
    }
}
