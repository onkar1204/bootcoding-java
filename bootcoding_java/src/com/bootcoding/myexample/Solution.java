package com.bootcoding.myexample;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        Solution solution = new Solution();

       int [] res = solution.runningSum(nums);

        for (int i=0; i<res.length; i++){

            System.out.println(res[i]);
        }

    }
    public int[] runningSum(int[] nums) {

        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for(int i=1; i<nums.length; i++){


            sum[i] = nums[i] + sum[i-1];

        }

        return sum;
    }

}