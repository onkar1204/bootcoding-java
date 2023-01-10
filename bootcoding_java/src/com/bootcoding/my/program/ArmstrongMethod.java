package com.bootcoding.my.program;

import java.util.Scanner;

public class ArmstrongMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = inputArraySize(scanner);
        int[] numbers = takeArrayFromUser(scanner, size);
        printArmstrongFromArray(numbers);
    }
    private static int inputArraySize(Scanner scanner) {
        System.out.println("Enter Array Length: ");
        int size = scanner.nextInt();
        return size;
    }
    private static int[] takeArrayFromUser(Scanner scanner, int size) {
        System.out.println(" Enter Elements: ");
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
    private static void printArmstrongFromArray(int[] num) {

        int temp = 0;
        for (int i = 0; i < num.length; i++) {

            int n = num[i];
            temp = n;
            int sum = 0;
            while (n != 0) {

                int rem = n % 10;

                sum = sum + (rem * rem * rem);
                n = n / 10;
            }
            if (sum == temp) {
                System.out.println(temp + " Armstrong ");
            } else {
                System.out.println(temp + " Not Armstrong ");
            }
        }
    }
}
