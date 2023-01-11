package com.bootcoding.myexample;

import java.util.Scanner;

public class ExerciseScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter A Number.. ");
        int a = sc.nextInt();
        System.out.println(" Enter A Number.. ");
        int b = sc.nextInt();
        System.out.println(" a+b = " + (a+b));
        System.out.println(" a2+b2 = " + ((a*a)+(b*b)));
        System.out.println(" (a+b)2 = " + ((a+b)*(a+b)));
        System.out.println(" a2+2ab+b2 = " + ((a*a)+(2*a*b)+(b*b)));
        System.out.println(" a2b2+2ab+a2-b2 = " + ((a*a)+(b*b)+(2*a*b)+(a*a)-(b*b)));
    }
}
