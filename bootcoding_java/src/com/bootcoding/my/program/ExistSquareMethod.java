package com.bootcoding.my.program;

import java.util.Scanner;
//WAM To Check Whether Square of X exists in given Array.
public class ExistSquareMethod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length Of Array");
        int s = sc.nextInt();
        System.out.println("Enter Number To Check");
        int a = sc.nextInt();
        int[] num = new int[s];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter Array Number ");
            num[i] = sc.nextInt();
        }

        ExistSquareMethod exist = new ExistSquareMethod();
        boolean res = ExistSquareMethod.existsSquareOfNumber(a , num);

        System.out.println(res);

    }

    public static boolean existsSquareOfNumber(int a , int[] num){

        for (int i=0; i<num.length; i++){

            int temp = a*a;
            if (temp == num[i]){
                return true;
            }

        }


        return false;
    }

}
