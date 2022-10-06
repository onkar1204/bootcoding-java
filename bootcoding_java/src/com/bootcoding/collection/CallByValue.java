package com.bootcoding.collection;

public class CallByValue {
    public static void main(String[] args) {
        int b = 10;
        add (b);
        System.out.println("Main " + b);
    }
    public static void add (int b){
         b = 30;
        System.out.println("After Add " + b);
    }
}
