package com.bootcoding.myexample;

public class PalindromNumber {

    public static void main(String args[]){

    int rem = 0;
    int n = 239;
    int temp = n;
        while(n != 0){
    int div = n/10;
        rem = rem * 10 + n%10;
        n = div;
    }
        if(rem == temp){
        System.out.println( rem + " Is   Palindrom");
    }else{
        System.out.println( rem + " Is Not Palindrom");
        }
    }
}