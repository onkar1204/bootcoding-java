package com.bootcoding.dsa;

public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        // Output: [3,4]
        int[] res = searchRange(nums, target);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                arr[0] = i;
                while (i < nums.length && nums[i] == target) {
                    arr[1] = i;
                    i++;
                }
            }
        }
        return arr;
    }
}
