package com.bootcoding.dsa;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
   //     Output: 2
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            //if hashmap does not contain the specific key
            if(!map.containsKey(i)){
                map.put(i,1);
            }

            //if it does contain the specific key,increase its count/value by 1
            else{
                map.put(i,map.get(i)+1);
            }
            //if the value of a specific key hai reached n/2 value,then return
        }
        for(int i:nums){
            if(map.get(i)>nums.length/2){
                return i;
            }
        }
        return 0;
    }
}
