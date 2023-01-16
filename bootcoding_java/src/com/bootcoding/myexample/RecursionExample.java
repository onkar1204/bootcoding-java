package com.bootcoding.myexample;
//WAP to print first 50 natural numbers using recursion (1,2,3,4....)
public class RecursionExample {
    public void printNatural(int num) {
        if(num == 0) {
            return;
        }
        printNatural(num - 1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        int num = 50;
        RecursionExample recursionExample = new RecursionExample();
        recursionExample.printNatural(num);
    }
}
