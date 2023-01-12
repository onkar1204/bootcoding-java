package com.bootcoding.my.program;

import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = inputArraySize(scanner);
        int[] numbers = takeArrayFromUser(scanner, size);
        printPrimeNumberOfArray(numbers);
    }
    private static int inputArraySize(Scanner scanner){
        System.out.println("Enter Array Length: " );
        int size = scanner.nextInt();
        return size;
    }
    private static int[] takeArrayFromUser(Scanner scanner, int size){
        System.out.println(" Enter Elements: ");
        int[] numbers = new int[size];
        for (int i=0; i<numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }
    private static void printPrimeNumberOfArray(int[] numbers){
        for (int i=0; i<numbers.length; i++){
            boolean res = isPrimeNumber(numbers[i]);
            System.out.println("is " + numbers[i] + " A Prime Number ? = " + res);
        }
    }
    public static boolean isPrimeNumber(int num){
        for (int i=2; i<num/2; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
