package com.bootcoding.discount.utils;

import java.util.Random;

public class VisitCountGenerator {
    final static int MAX = 499;
    final static int MIN = 10;
    static Random random = new Random();

    public static int getVisitCount() {
        int number = random.nextInt(MAX - MIN);
        return MIN + number;
    }
}
