package com.bootcoding.dsa;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
//        Output: 3
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        int max = nums[0];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }










}
