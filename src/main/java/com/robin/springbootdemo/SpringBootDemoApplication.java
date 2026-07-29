package com.robin.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
        System.out.println("hello springboot");
        Alien obj = context.getBean(Alien.class);
        /*
         Laptop lap = context.getBean(Laptop.class);
         lap.compile();
        */
        obj.code();
    }
}
