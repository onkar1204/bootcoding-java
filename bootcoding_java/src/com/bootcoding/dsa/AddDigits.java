package com.bootcoding.dsa;
public class AddDigits{
    public static int addDigits(int num) {
        if (num < 10){
            return num;
        }
        return addDigits(num/10 + num%10);
    }
    public static void main(String[] args) {
            int num = 38;
        System.out.println(addDigits(num));
        }







    }