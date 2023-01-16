package com.bootcoding.myexample;

public class RecursionExample {

    public void test(int num) {

        if(num == 0) {
            return;
        }

        test(num - 1);

        System.out.println(num);
    }
    public static void main(String[] args) {
        int num = 100-50;

        RecursionExample recursionExample = new RecursionExample();
        recursionExample.test(num);

    }
}
