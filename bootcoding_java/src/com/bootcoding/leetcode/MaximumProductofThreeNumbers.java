package com.bootcoding.leetcode;

import java.util.Arrays;
//628. Maximum Product of Three Numbers
public class MaximumProductofThreeNumbers {
    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
//        Output: 39200
        System.out.println(maximumProduct(nums));
    }
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int sum2 = 1;
        int sum1 = 1;


       sum1 = sum1*(nums[nums.length-1])*(nums[nums.length -2])*(nums[nums.length-3]);

        sum2 = sum2*(nums[0])*(nums[1])*(nums[nums.length-1]);

        if (sum1 > sum2){
            return sum1;
        }
        return sum2;

        }
}
