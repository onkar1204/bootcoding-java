package com.bootcoding.dsa;

public class MinimumDistancetotheTargetElement {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1};
        int target = 1;
        int start = 9;
//        Output: 0
        System.out.println(getMinDistance(nums , target , start));
    }
    public static int getMinDistance(int[] nums, int target, int start) {
        int res = 1000000;
        for(int i=0; i<nums.length; i++){
            if(target == nums[i]){
                res = Math.min(res, Math.abs(i - start));
            }
        }







        return res;
    }
}
