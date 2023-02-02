package com.bootcoding.dsa;

public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
       // Output: 1
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int min =nums[0];
        for (int i=0; i<nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return min;
    }
}
