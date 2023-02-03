package com.bootcoding.dsa;

import java.util.Arrays;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
   //     Output: [0,1,9,16,100]
        for (int res : nums){
            System.out.println(res);
        }
    }
    public static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int sum = nums[i] * nums[i];
            arr[i] = sum;
        }
        Arrays.sort(arr);
        return arr;
    }
}
