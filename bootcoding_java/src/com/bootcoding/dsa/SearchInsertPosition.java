package com.bootcoding.dsa;

import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {3,6,7,8,10};
        int target = 5;
//        Output: 2
        System.out.println(searchInsert(nums , target));
    }
    public static int searchInsert(int[] nums, int target) {
        int res = nums.length;
        for(int i=0; i<nums.length; i++){
            if(target == nums[i]){
                return i;
            } else if (target < nums[i]) {
                return i;
            }
        }
        return res;
        }
}
