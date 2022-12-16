package com.bootcoding.marks;

import java.util.Random;

public class StudentClass {
    final static int MAX = 99;
    final static int MIN = 10;
    static Random random = new Random();

    public static int RandomMarks(){
        int number = random.nextInt(MAX - MIN);
        int rm = MIN + number;
        System.out.println(" RandomMarks = " + rm);
        return rm;
    }

    public static void main(String[] args) {
        for(int i =0; i < 10; i++) {
            StudentClass.RandomMarks();
        }
    }
}
