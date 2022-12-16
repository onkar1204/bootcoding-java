package com.bootcoding.task;

public class  GratestCommonDivisor {

//    Write a program to find Greatest Common Divisor (GCD), Factor (GCF) or Highest Common Factor (HCF) of two numbers.


public static void main(String[] args) {

    int  a = 10;
    int  b = 20;

    for (int i=1;i<b;i++){

        if ((a%i==0) && (b%i==0)){
            System.out.println(i);
        }



    }

}

}

