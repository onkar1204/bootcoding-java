package com.bootcoding.dsa;

import java.util.Arrays;

//Find Numbers with Even Number of Digits
class EvenDigitFind {
    public static void main(String[] args) {
        int[] nums ={12,345,2,6,7896};
         findNumbers(nums);
    }
    public static void findNumbers(int[] nums) {
        int sum = 0;
        int i;
        Arrays.sort(nums);
        for (i = 0; i < nums.length; i++) {
            int count = 0;
            while(nums[i] != 0){
                int div = nums[i]/10;
                count++;
                nums[i]=div;
            }













            if (count % 2 == 0){
                sum++;
            }
        }
        System.out.println(sum);
    }
}