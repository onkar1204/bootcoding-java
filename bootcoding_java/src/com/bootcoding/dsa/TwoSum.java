package com.bootcoding.dsa;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15}; int target = 9;
//        Output: [0,1]
        for (Integer rs: twoSum(nums,target)){
            System.out.println(rs);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                arr[0] =  map.get(nums[i]);
                arr[1] = i;
                return arr;
            }


            else{
                map.put(target-nums[i] , i);
            }
        }
        return arr;
    }
}
