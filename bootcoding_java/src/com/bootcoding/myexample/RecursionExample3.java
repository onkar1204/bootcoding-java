package com.bootcoding.myexample;
// WAP to print the array elements using recursion
public class RecursionExample3 {

    public int arrayElements(int num){
        if (num == 0){
            return 1;
        }
        arrayElements(num-1);
        System.out.println(num);
        return num;
    }

    public static void main(String[] args) {
        int num = 50;

        RecursionExample3 recursionExample3 = new RecursionExample3();
        recursionExample3.arrayElements(num);
    }

}
