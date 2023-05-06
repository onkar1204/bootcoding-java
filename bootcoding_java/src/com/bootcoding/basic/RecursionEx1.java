package com.bootcoding.basic;

public class RecursionEx1 {
    public static void main(String[] args) {
        int num = 123456789;
        System.out.println(countDigit(num));
    }

    public static int countDigit(int num) {


        if (num == 0) {
            return 0;
        }else {

            return 1+countDigit(num / 10);
        }

    }
}
