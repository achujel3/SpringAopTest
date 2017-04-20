package org.springtest.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("allCircleMethods()")
    public void loggingAdvice(JoinPoint joinPoint) {
        System.out.println(joinPoint.toString());
    }

    @AfterReturning(pointcut = "args(name)", returning = "returnString")
    public void stringArgumentMethods(String name, Object returnString) {
        System.out.println("A method that takes String arguments has been called");
        System.out.println("And the parameter is " + name);
        System.out.println("Returning: " + returnString);
    }

    @AfterThrowing(pointcut = "args(name)", throwing = "ex")
    public void exceptionAdvice(String name, Exception ex) {
        System.out.println("An exception has been thrown " + ex);
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
