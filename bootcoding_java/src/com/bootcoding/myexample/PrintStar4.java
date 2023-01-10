package com.bootcoding.myexample;

public class PrintStar4 {
    public static void main(String[] args) {
        int res =0;
        for (int i=1; i<=5; i++){

            for (int j=1; j<=i;j++){
            res = res + 1;


                System.out.print(res + " " );
            }
            System.out.println();
        }

    }
}