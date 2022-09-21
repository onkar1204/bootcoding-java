package com.bootcoding.oops.polymorphism;

public class calculator {


    public int add(int a, int b){
        return a+b;

    }
    public int add(int[] arr){
        int sum=0;
        for (int i=0 ;i<arr.length;i++){
            sum=sum+ arr[i];
        }
        return sum;
    }

    public double add (int d,double e){
        double sum=d+e;
        return sum;

    }

}
