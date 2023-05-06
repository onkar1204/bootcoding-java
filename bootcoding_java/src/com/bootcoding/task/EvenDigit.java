package com.bootcoding.task;

public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {12, 23, 56, 89, 87, 45, 51, 21, 65, 69, 66, 98, 28};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;

            }
        }
        int[] nums2 = new int[count];


        int index = nums2.length -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums2[index--] = nums[i];
            }
        }

        for(int i = 0; i < nums2.length; i++){
            System.out.println(nums2[i]);
        }


    }
}
