package com.bootcoding.dsa.unsolved;
import java.util.HashMap;
import java.util.Map;
public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,4,2};
        //        Output: 2
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
           for (int i = 0; i < nums.length; i++) {
               if(!map.containsKey(nums[i])){
                   map.put(nums[i], 1);
               }else{
                   return nums[i];
               }
        }
        return 0;
    }
}
