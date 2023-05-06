package com.bootcoding.dsa.unsolved;

public class StringtoInteger {
    public static void main(String[] args) {
        String s = "42 ";
//        Output: 42
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        int res = 0;
        try {
             res = Integer.parseInt(s);

        }
        catch (Exception e){

        }
        return res;
    }
}
