package com.bootcoding.dsa;

import com.bootcoding.dsa.FindFirstandLastPositionofElementinSortedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
//        Output: [1,2]
        FindFirstandLastPositionofElementinSortedArray find = new FindFirstandLastPositionofElementinSortedArray();
            System.out.println(targetIndices(nums,target));
    }
    public static   List <Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);
        for (int i=0; i< nums.length; i++){
            if (target == nums[i]){
                list.add(i);
            }
        }
        return list;
    }
}
