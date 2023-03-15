package com.bootcoding.dsa;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
     //   Output: 4
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }




        int min = Integer.MAX_VALUE;
        int minkey = nums[0];

        for(Integer key : map.keySet()){
            Integer value = map.get(key);
            if(value < min){
                min = value;
                minkey = key;
            }

        }


        return minkey;
    }
}
