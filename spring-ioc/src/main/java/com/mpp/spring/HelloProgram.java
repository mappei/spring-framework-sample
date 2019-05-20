package com.mpp.spring;

import com.mpp.spring.helloworld.HelloWorld;
import com.mpp.spring.helloworld.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloProgram {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloWorldService service = (HelloWorldService) context.getBean("1234");

        HelloWorld helloWorld = service.getHelloWorld();
        System.out.println(helloWorld.print());

    }

}
