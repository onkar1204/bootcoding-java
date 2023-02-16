package com.bootcoding.dsa;

import java.util.*;

public class MajorityElement2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
//        Output: [1,2,3]
        System.out.println(majorityElement(nums));
    }
    public static List<Integer> majorityElement(int[] nums) {




        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer> store = new ArrayList();
        for(int i:nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        for(int i:map.keySet()){
            if(map.get(i)>nums.length/3){
                store.add(i);
            }
        }
        return store;
    }
}



