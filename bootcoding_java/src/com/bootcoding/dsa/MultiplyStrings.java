package com.bootcoding.dsa;

import java.math.BigInteger;
// Leetcode -
public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "123456789", num2 = "987654321";
        //Output: "121932631112635269"
        System.out.println(multiply(num1,num2));
    }



    public static String multiply(String num1, String num2) {
        BigInteger one = new BigInteger(num1);
        BigInteger two = new BigInteger(num2);
        BigInteger mul = one.multiply(two);
        String res = String.valueOf(mul);
    return res;
    }
}

