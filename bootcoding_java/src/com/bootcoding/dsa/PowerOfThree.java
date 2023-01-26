package com.bootcoding.dsa;

public class PowerOfThree {
    public static void main(String[] args) {


        int n = -1;

        isPowerOfThree(n);
        System.out.println(

                isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        if (n == 0) return false;
        if (n % 3 != 0){
            return false;
        }
        return isPowerOfThree(n/3);


    }
}
