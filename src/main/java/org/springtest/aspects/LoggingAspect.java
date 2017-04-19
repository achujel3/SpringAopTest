package org.springtest.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("allCircleMethods()")
    public void loggingAdvice(JoinPoint joinPoint) {
        System.out.println(joinPoint.toString());
    }

    @Before("args(name)")
    public void stringArgumentMethods(String name) {
        System.out.println("A method that takes String arguments has been called. And the parameter is "
                + name);
    }

    @Pointcut("execution(* get*())")
    public void allGetters() {
        System.out.println("All getters");
    }

    @Pointcut("within(org.springtest.model.Circle)")
    public void allCircleMethods() {
        System.out.println("All circle methods");
    }

}
