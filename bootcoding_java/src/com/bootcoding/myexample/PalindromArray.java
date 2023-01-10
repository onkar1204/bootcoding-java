package com.bootcoding.myexample;

public class PalindromArray {
    public static void main(String[] args) {
        int[] num = {153, 370, 111, 121, 120, 406, 151, 545, 143};

        int i;

        int temp = 0;
        for (i = 0; i < num.length; i++) {
            int rem = 0;
            int n = num[i];
            temp = n;
            int sum = 0;
            while (n != 0) {

                int div = n / 10;

                rem = rem * 10 + n % 10;

                n = div;
            }
            if (rem == temp) {

                System.out.println(rem + " Is   Palindrom");

            } else {

                System.out.println(rem + " Is Not Palindrom");

            }
        }
    }
}
