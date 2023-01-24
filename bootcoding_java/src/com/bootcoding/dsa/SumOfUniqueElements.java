package com.bootcoding.dsa;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] nums={1,2,3,2,4,2,4,6};
         sumOfUnique(nums);
            System.out.println(sumOfUnique(nums));
    }
    public static int sumOfUnique(int[] nums) {
        Map<Integer , Integer> unique = new HashMap<>();
        int sum = 0;
    for (int i=0; i< nums.length; i++) {

        if (null == unique.get(nums[i])){
            unique.put(nums[i] , 1);
        }else {
            unique.put(nums[i],unique.get(nums[i]) + 1);
        }
    }
    for (int key: unique.keySet()){
        if (unique.get(key) == 1){
            sum = sum + key;
        }
    }


    return sum;
    }
}
