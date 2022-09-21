package com.bootcoding.recursion;

public class FibonacciSeries {
    public int fib(int n){
        if(n<=1){
            return n;
        }
        return fib (n-1) + fib (n-2);
    }

    public static void main(String[] args) {
        FibonacciSeries f=new FibonacciSeries();
        f.fib (5);
        System.out.println(+f.fib(5));
    }
}
