package com.bootcoding.dsa;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
//        Output: 3
        System.out.println(heightChecker(heights));
    }

    public static int heightChecker(int[] heights) {
        int[] arr = new int[heights.length];
        for (int a = 0; a < heights.length; a++) {
            arr[a] = heights[a];
        }
        Arrays.sort(arr);
        int count = 0;



        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != arr[i]) {
                count++;
//                }else if (heights[i] != arr[i]){
//                    count++;
//                }

            }


        }return count;
    }
}
