package com.bootcoding.dsa;
//Concatenation of Array
class ConcatenationofArray {

    public static void main(String[] args) {
//        int[] nums2 = new int[nums.length*2];
//        //Output: [1,3,2,1,1,3,2,1]}
//        int i =0;
//        for (int k = 0; k < nums2.length; k++) {
//           nums2[k] = nums[i];
//                i=i+1;
//           if (i == nums.length){
//               i=0;
//           }
//            System.out.print(nums2[k]);
//        }
        int[] nums = {1, 3, 2, 1};
        int[] res = getConcatenation(nums);
        for (int i=0; i<res.length;i++) {
            System.out.print(res[i] + " ");
        }
    }
    public static int[] getConcatenation(int[] nums) {
    int[] nums2 = new int[nums.length*2];
    int k =0;
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = nums[k];
            k = k+1;
            if (k == nums.length) {
                k = 0;
            }
        }
        return nums2;
    }
}