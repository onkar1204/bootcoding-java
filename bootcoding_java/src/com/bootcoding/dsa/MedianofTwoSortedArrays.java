package com.bootcoding.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//4. Median of Two Sorted Arrays
public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,3} ,nums2 = {2};
//        Output: 2.00000
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums1){
            list.add(i);
        }
        for (int j : nums2){
            list.add(j);
        }
        Collections.sort(list);
        if (list.size()%2==0){
            int n =list.size()/2;
            return (double) (list.get(n-1)+ list.get(n))/2;
        }else {
            return (double) list.get(list.size()/2);
        }
    }

}
