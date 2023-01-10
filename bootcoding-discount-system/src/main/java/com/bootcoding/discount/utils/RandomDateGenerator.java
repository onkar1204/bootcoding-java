package com.bootcoding.discount.utils;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Random;
@Component
public class RandomDateGenerator {

    public static final int MAX=10;
    public static final int MIN=1;
    public static int generateDate(){

        Random random = new Random();

       int  date = random.nextInt(MAX-MIN);
       return date+MIN;
    }

    public static void main(String[] args) {

    }
}
