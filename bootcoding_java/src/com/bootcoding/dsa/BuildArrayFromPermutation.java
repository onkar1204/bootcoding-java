package com.bootcoding.dsa;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
//        Output: [0,1,2,4,5,3]
        int[] res = buildArray(nums);
        for (int i : res){
            System.out.print(i + " ");
        }
    }
    public static int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[nums[i]];
            }
        return res;
    }
   /*public static int[] buildArray(int[] nums) {
       int n = nums.length;
       for(int i=0; i<n;i++){
           nums[i] = n * (nums[nums[i]] % n) + nums[i];
       }
       for (int i=0;i<n;i++){
           nums[i] = nums[i]/n;
       }
       return nums;
   }*/
}
