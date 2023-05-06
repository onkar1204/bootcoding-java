package com.bootcoding.leetcode;
//   1952. Three Divisors
public class ThreeDivisors {
    public static void main(String[] args) {
        int n = 2;
//        Output: false
        System.out.println(isThree(n));
    }
    public static boolean isThree(int n) {
        int count=0;
        for (int i = 1; i <=n ; i++) {
            if (n%i==0)
            count++;
        }
        return count==3;
    }
}
