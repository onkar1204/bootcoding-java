package com.bootcoding.myexample;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Here");
        int num = sc.nextInt();
        boolean isPrime = true;
        for(int i=2;i<num;i++)
        {
            if(num%i==0){
                System.out.println(num + " Is Not Prime number!");
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num+ " Is  Prime Number ! "  );
        }
}
}
