package com.bootcoding.basic;

public class EvenOddArray {
    public static void main(String[] args) {


        int numbers[] = new int [8];

        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 20;
        numbers[3] = 25;
        numbers[4] = 35;
        numbers[5] = 75;
        numbers[6] = 80;
        numbers[7] = 95;

       for(int i=0; i< numbers.length; i++) {
           if (numbers[i] % 2 == 0) {
               System.out.println(numbers[i] + " is Even");
           }
       }



    }
}
