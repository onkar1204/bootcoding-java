package com.bootcoding.recursion;

public class Factorial {
    public int factorial (int num) {
        if (num == 1) {
            return 1;

        }

        return num * factorial(num - 1);

    }
    public static void main(String[] args) {


        Factorial f = new Factorial ();
         int k=f.factorial(4);
        System.out.println(+k);
    }





}
