package org.springtest.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("allGetters()")
    public void loggingAdvice() {
        System.out.println("Advice run. Get method called");
    }

    @Before("allGetters()")
    public void secondAdvice() {
        System.out.println("Second advice executed");
    }

    @Pointcut("execution(* org.springtest.model.*.get*())")
    public void allGetters(){

    }
}
