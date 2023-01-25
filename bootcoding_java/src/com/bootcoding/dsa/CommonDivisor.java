package com.bootcoding.dsa;

import java.util.Arrays;

public class CommonDivisor {

    public static void main(String[] args) {
        int[] nums={3,3};

        System.out.println(findGCD(nums));


        }

    public static int findGCD(int[] nums) {

          Arrays.sort(nums);

          int max =nums[nums.length-1];
          int min = nums[0];
          int sum = 0;
          for (int i=1; i<=max; i++) {

              if (min % i == 0 && max % i == 0){
                  sum = i;
              }
          }
    return sum;
    }
}
