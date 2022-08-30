package com.bootcoding.basic;

public class FibonacciSeries {
    public static void main(String[] args) {

        int p1=1,p2=1,sum=1;
int n = 5;
        for(int i=0; i<=n; i++){

            System.out.println("Fibonacci Series is " + sum);
            p2=p1;
            p1=sum;
            sum=p1+p2;

        }




    }
}
