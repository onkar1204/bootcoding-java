package com.bootcoding.myexample;
//WAP to count the digits of a given number using recursion
public class RecursionExample4 {
   static int count = 0;
public static int countDigits(int num) {
    if (num != 0) {
        count = count+1;
        countDigits(num / 10);
    }
    return count;









}
    public static void main(String[] args) {
        int num = 12345678;

          System.out.println(countDigits(num));
    }
}
