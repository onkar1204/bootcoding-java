package com.bootcoding.my.program;

import java.util.Scanner;
//Write A method To Find Largest Element Of An Array
public class MaxArrayMethod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length Of Array");
        int s = sc.nextInt();
        int[] num = new int[s];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter number ");
            num[i] = sc.nextInt();
        }
        MaxArrayMethod max = new MaxArrayMethod();
        int res = MaxArrayMethod.findLargestElement(num);
            System.out.println(" Max Element Of Array Is: " + res);
        }
    public static int findLargestElement(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
}
