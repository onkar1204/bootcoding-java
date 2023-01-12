package com.bootcoding.my.program;

import java.util.Scanner;
public class PalindromMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = inputArraySize(scanner);
        int[] numbers = takeArrayFromUser(scanner, size);
        printPalindromFromArray(numbers);
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
    private static void printPalindromFromArray(int[] num){
        int temp = 0;
        for (int i = 0; i < num.length; i++) {
            int rem = 0;
            int n = num[i];
            temp = n;
            int sum = 0;
            while (n != 0) {
                int div = n / 10;
                rem = rem * 10 + n % 10;
                n = div;
            }
            if(rem == temp){
            System.out.println(rem + " Is   Palindrom");
        }else {
            System.out.println(rem + " Is Not Palindrom");
        }
        }
    }
}
