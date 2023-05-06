package com.bootcoding.task;

public class ElementAverage {
    public static void main(String[] args) {
        int[] nums={2,4,6};

        int sum = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum +nums[i];
        }
        res = sum/ nums.length;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > res ){
                System.out.println(nums[j]);
            }
        }
    }


}
