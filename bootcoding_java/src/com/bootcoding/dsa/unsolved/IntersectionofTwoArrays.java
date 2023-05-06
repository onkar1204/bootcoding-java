package com.bootcoding.dsa.unsolved;
//349. Intersection of Two Arrays

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
//        Output: [2]
        int[] res = intersection(nums1,nums2);
        for (int i=0; i< res.length; i++){
            System.out.println(res[i]);
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!map.containsKey(nums1[i])) {
                map.put(nums1[i], 1);
            } else {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (!map.containsKey(nums2[i])) {
                map.put(nums2[i], 1);
            } else {
                map.put(nums2[i], map.get(nums2[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 2) {
                list.add(entry.getKey());
            }
        }
        int[] nums3 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums3[i] = list.get(i);
        }
        return nums3;

    }
}

