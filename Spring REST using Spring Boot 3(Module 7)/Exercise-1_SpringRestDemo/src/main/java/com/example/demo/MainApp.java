package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
    	SpringApplication.run(SpringRestDemoApplication.class, args);
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Country country = (Country) context.getBean("country");

        System.out.println(country);
    }
}