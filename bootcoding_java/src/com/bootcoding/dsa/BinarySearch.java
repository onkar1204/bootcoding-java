package com.bootcoding.dsa;
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        //Output: 4
        System.out.println(search(nums , target));
    }
    public static int search(int[] nums, int target) {
        int res = -1;
        for(int i=0; i<nums.length; i++){
            if(target == nums[i]){
                res = i;
            }
        }
        return res;
    }











}
