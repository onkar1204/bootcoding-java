package com.bootcoding.dsa.unsolved;

public class MinimumOperationstoMaketheArrayIncreasing {
    public static void main(String[] args) {
       int[] nums = {1,1,1};
//        Output: 3
        System.out.println(minOperations(nums));
    }
    public static int minOperations(int[] nums) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] >= nums[i+1]){
                sum = nums[i+1]+1;
                count++;
                nums[i+1] = sum;
            }
        }
       return count;
    }
}
