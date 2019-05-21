package com.mpp.domain;

import com.mpp.domain.knight.BraveKnight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {
        //ApplicationContext context = new FileSystemXmlApplicationContext("/knight.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
        BraveKnight knight = (BraveKnight) context.getBean("braveKnight");
        knight.knightOnEmbark();
        System.out.println(knight.toString());
    }
}
