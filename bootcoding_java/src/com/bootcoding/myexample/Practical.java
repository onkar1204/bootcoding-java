package com.bootcoding.myexample;

public class Practical {

    public static  void main(String[] args) {
        int[] num = {11, 20, 30, 43, 5,56,47,89,65,23,12,23,65,45,78,95,65,12,04,19,97};
        int min = num[0];
        int max = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            else if (num[i] > max) {
                   max= num[i];
            }
             if (num[i] % 2 == 0){
                System.out.println("even number " + num[i]);
               }
             if (num[i] % 2 != 0){
                 System.out.println("Odd Number " + num[i]);
             }
             if (num[i] % 3 == 0 && num[i] % 5 == 0){
                 System.out.println("Divisible By 3 & 5 " + num[i]);
             }
        }
        System.out.println("Minimun Number " + min);
        System.out.println("Maximum Number " + max);
    }
}
