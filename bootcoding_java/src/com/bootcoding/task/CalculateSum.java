package com.bootcoding.task;

public class CalculateSum {
//    Write a program to calculate the sum of following series where n is input by user.
//            1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n

public static void main(String[] args) {

        int n = 15;
        double sum = 1;


        for (double i=2; i<=n;i++){

            sum = sum + (1/i);


        }

        System.out.print(sum);
}

}
