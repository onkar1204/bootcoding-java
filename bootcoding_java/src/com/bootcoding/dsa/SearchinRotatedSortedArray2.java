package com.bootcoding.dsa;

public class SearchinRotatedSortedArray2 {
    public static void main(String[] args) {
       int[] nums = {2,5,6,0,0,1,2};
       int target = 0;
       // Output: true
        System.out.println(search(nums , target));
    }
    public static boolean search(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){
            if(target == nums[i]){
                return true;
            }
        }
        return false;
    }
}
