package com.bootcoding.dsa;
//2413. Smallest Even Multiple
public class SmallestEvenMultiple {
    public static void main(String[] args) {
        int n = 5;
//        Output: 10
        System.out.println(smallestEvenMultiple(n));
    }
    public static int smallestEvenMultiple(int n) {
         int res = 0;
        for (int i = 1; i < 10; i++) {
            int sum=n*i;
            if (sum%n==0 && sum %2==0){
                 res = sum;
                 break;
            }
        }
        return res;
    }
}
