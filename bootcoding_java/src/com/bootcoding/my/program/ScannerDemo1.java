package com.bootcoding.my.program;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Math Marks...");
        int maths = scanner.nextInt();
        System.out.println("Enter Math Marks...");
        int physics = scanner.nextInt();
        System.out.println("Enter Math Marks...");
        int chemistry = scanner.nextInt();

        double percentage = calcPercentage(maths,physics,chemistry);
        double average = calcAverage(maths,physics,chemistry);
       char grade = calcGrade(percentage);

        System.out.printf(" %.2f  " , percentage);
        System.out.printf(" %.2f " , average);
       System.out.println("Grade " + grade);
    }

    private static char calcGrade(double percentage) {

        if (percentage >= 75){
            return 'A';
        } else if (percentage >= 60) {
            return 'B';
        }
        return 'C';

    }

    private static double calcAverage(int maths, int physics, int chemistry) {

        double sum = maths + physics + chemistry;
        sum = sum/3;

        double avrage = sum;

        return avrage;
    }

    private static double calcPercentage(int maths, int physics, int chemistry) {

        double sum = maths + physics + chemistry;
           sum = sum / 300 * 100;
        double percentage = sum;
        return percentage;
    }

}
