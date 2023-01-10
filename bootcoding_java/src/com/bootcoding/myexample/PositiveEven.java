package com.bootcoding.myexample;

import java.util.Scanner;
//WAP to check whether a given integer is positive even, negative even,
//positive odd or negative odd. Print even if the number is 0.
//Test Data :
//Input an integer: 13
//Expected Output:
//Positive Odd

public class PositiveEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number..");
        int num = sc.nextInt();

        if (num == 0){
            System.out.println(" Even ");
        }else {
            if (num % 2 == 0) {
                if (num > 0) {
                    System.out.println(" Positive Even ");
                } else if (num < 0) {
                    System.out.println("Negative Even");
                }
            } else if (num > 0) {
                System.out.println(" Positive Odd ");

            } else if (num < 0) {
                System.out.println(" Negative Odd ");

            }
        }

    }
}
