package com.bootcoding.dsa;

import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int n =sc.nextInt();
        int[] num = new int[n];
        for (int i=0;i< num.length;i++){
            System.out.println("Enter Elements");
           num[i] =sc.nextInt();
        }
        int[] res = plusOneArray(num);

        for(int i = 0; i<res.length; i++){
            System.out.println(res[i]);
        }
    }
    private static int[] plusOneArray(int[] num) {
        // [1,2,3] -> [1,2,4] | [1,2,9] -> [1,3,0]
        for(int i = num.length-1;  i >= 0; i--){
            if(num[i] < 9){
                num[i] = ++num[i];
                return num;
            }
            num[i] = 0;
        }
        num = new int[num.length + 1];
        num[0] = 1;
        return num;
    }
}
