package com.bootcoding.dsa;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        //Output: [4,0,1,1,3]
        for (int a : smallerNumbersThanCurrent(nums)){
            System.out.println(a);
        }

    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i=0; i< nums.length; i++){
            int count = 0;

            for (int l=0; l< nums.length; l++){
                if (nums[i] > nums[l]){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;

    }
}
