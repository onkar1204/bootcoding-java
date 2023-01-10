package com.bootcoding.discount.utils;

import java.util.Random;

public class OrderCountGenerator {
    final static int MAX = 799;
    final static int MIN = 10;
    static Random random = new Random();

    public static int getOrderCount(){
        int number = random.nextInt(MAX - MIN);
        return MIN+number;
    }
}
