package org.springtest.main;

import org.springtest.services.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ShapeService shapeService = applicationContext.getBean("shapeService", ShapeService.class);
        shapeService.getCircle().setNameWithReturn("Dummy name");
        System.out.println(shapeService.getCircle().getName());

    }

}
