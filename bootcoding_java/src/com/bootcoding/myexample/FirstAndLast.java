package com.bootcoding.myexample;

    public class FirstAndLast {
    public static void main(String args[]){
    int num = 456868768;
    int first = 0;
    int last = num % 10;
    while(num != 0){
        first = num; // 456868768, 45686876, 4568687, 456868, 45686, 4568, 456, 45, 4
        num = num/10; // 45686876, 4568687, 456868, 45686, 4568, 456, 45, 4, 0
    }
        System.out.println("First = " + first);
        System.out.println("Last = " + last);
    }
    }