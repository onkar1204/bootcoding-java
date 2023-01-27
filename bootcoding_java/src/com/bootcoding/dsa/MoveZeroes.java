package com.bootcoding.dsa;

// Move Zeroes
public class MoveZeroes {
    //    Output: [1,3,12,0,0]
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[x] = nums[i];
                x++;
            }
        }
        for (int j = x; j < nums.length; j++) {
            nums[j] = 0;
        }

        for (int k=0; k< nums.length; k++){
            System.out.println(nums[k]);
        }
    }
}