package com.bootcoding.dsa;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        isPowerOfTwo(n);
        System.out.println(isPowerOfTwo(n));
    }


    public static boolean isPowerOfTwo(int n) {

       if (n == 1) return true;
       if (n == 0) return false;
       if (n % 2 != 0){
           return false;
       }

        return isPowerOfTwo(n/2);
    }
}
