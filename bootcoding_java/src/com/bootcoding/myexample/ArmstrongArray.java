package com.bootcoding.myexample;

public class ArmstrongArray {
    public static void main(String[] args) {
        int[] num = {153,370,111,371,120,406,407,372,143};

        int i;

        int temp = 0;
        for (i = 0; i < num.length; i++) {

            int n = num[i];
            temp = n;
            int sum = 0;  // Har Loop ke sath sum ki value 0 and again compare with temp
           while (n != 0) {

               int rem = n % 10;

               sum = sum + (rem * rem * rem);
              n=n/10;
           }
            if (sum == temp){
                System.out.println(temp + " Armstrong ");
            }else{
                System.out.println(temp + " Not Armstrong ");
            }
        }
        }
    }

