package com.bootcoding.basic;

public class ReverseExample {
    public static void main(String[] args) {
        int[] nums= {12,23,45,65,78,98};

        for (int i = 0; i < nums.length/2; i++) {
            int temp  = nums[nums.length-1-i];
            nums[nums.length-1-i] = nums[i];
            nums[i] = temp;
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }
    }
}
