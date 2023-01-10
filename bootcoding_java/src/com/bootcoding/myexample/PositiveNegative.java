package com.bootcoding.myexample;

public class PositiveNegative {

    public static void main (String[] args){

        int num[] = new int [5];
         num [0] = 5;
         num [1] = -4;
         num [2] = 10;
         num [3] = 15;
         num [4] = -1;
         int count = 0;
         int p =0;


        for(int i=0; i<5; i++){

            if(num[i] >= 0){
                p++;

            }else{
                count++;

            }
        }

        System.out.println(" NUMBER OF POSITIVE NUMBERS " + p);
        System.out.println(" NUMBER OF NEGATIVE NUMBERS " + count);
    }
}
