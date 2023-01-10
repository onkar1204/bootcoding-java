package com.bootcoding.discount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DiscountApplication implements ApplicationRunner {



    public static void main(String[] args) {
        SpringApplication.run(DiscountApplication.class, args);


    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Welcome to Spring Boot App! ");





    }
}
