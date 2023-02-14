package com.bootcoding.dsa;

public class KeepMultiplyingFoundValuesbyTwo {
    public static void main(String[] args) {
        int[] nums = {8,19,4,2,15,3};
        int original = 2;
//        Output: 16
        System.out.println(findFinalValue(nums,original));
    }
    public static int findFinalValue(int[] nums, int original) {
        for(int i=0; i<nums.length; i++){
            if(original == nums[i]){
                original = 2*original;
                i =-1;
            }



        }
        return original;
    }
}
