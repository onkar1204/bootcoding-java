package com.bootcoding.leetcode;
//1470. Shuffle the Array
public class ShuffletheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
//        Output: [2,3,5,4,1,7]
        int[] res = shuffle(nums,n);
        for (int i = 0; i < res.length ; i++) {
            System.out.println(res[i]);
        }

    }
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int i=0 , j=n , k =0;
        while (i<n && j<2*n){
            arr[k++] = nums[i++];
            arr[k++] = nums[j++];
        }
        return arr;
    }

}
