package com.bootcoding.dsa;

public class ApplyOperationsToAnArray {
    public static void main(String[] args) {
       int[] nums = {1,2,2,1,1,0};
//        Output: [1,4,2,0,0,0]
        int[] res = applyOperations(nums);
        for (int i=0; i< res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
    public static int[] applyOperations(int[] nums) {

        for (int i=0; i<nums.length-1; i++){
            if (nums[i] == nums[i+1]){
                int res = nums[i] * 2;
                nums[i+1] = 0;
                nums[i] = res;
            }
        }
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
        return nums;
    }
}
