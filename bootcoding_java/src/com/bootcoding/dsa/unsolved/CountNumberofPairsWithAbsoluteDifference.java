package com.bootcoding.dsa.unsolved;

import java.util.HashMap;
import java.util.Map;

public class CountNumberofPairsWithAbsoluteDifference {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k = 1;
//        Output: 4
        System.out.println(countKDifference(nums,k));
    }
    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            for (int j = i+1; j <= nums.length-1; j++) {
                if (Math.abs(nums[i]-nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
