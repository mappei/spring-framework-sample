package com.mpp.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

        HelloWorld helloWorld = (HelloWorld)context.getBean("helloBean");
        System.out.println(helloWorld.getName());

    }
}
