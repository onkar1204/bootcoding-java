package com.bootcoding.discount.utils;

import java.util.Random;

public class MarksGenerator {
    final static int MAX = 80;
    final static int MIN = 10;
    static Random random = new Random();

    public static int getMarks() {
        int number = random.nextInt(MAX - MIN);
        return MIN + number;
    }
}
