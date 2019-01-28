package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        String[] beanNames = context.getBeanDefinitionNames();
        for (String name : beanNames) {
            System.out.println(name);
        }
        System.out.println(beanNames.length);

    }

}
