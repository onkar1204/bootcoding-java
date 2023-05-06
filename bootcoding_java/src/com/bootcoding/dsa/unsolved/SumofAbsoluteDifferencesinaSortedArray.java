package com.bootcoding.dsa.unsolved;

import java.util.ArrayList;
import java.util.List;

//1685. Sum of Absolute Differences in a Sorted Array
public class SumofAbsoluteDifferencesinaSortedArray {
    public static void main(String[] args) {
        int[] nums = {2,3,5};
//        Output: [4,3,5]
        int[] res = getSumAbsoluteDifferences(nums);
        for (int i=0; i< res.length; i++){
            System.out.println(res[i]);
        }
    }
    public static int[] getSumAbsoluteDifferences(int[] nums) {

        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int res = 0;
            for (int j = 0; j < nums.length; j++) {
                sum = Math.abs(nums[i] - nums[j]);
               res =  res + sum;
            }
            arr[i] = res;
        }
        return arr;
    }
}
