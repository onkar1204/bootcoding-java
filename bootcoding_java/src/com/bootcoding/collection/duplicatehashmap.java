package com.bootcoding.collection;

import com.sun.jdi.IntegerValue;

import java.util.HashMap;

public class duplicatehashmap {
    public static void main(String[] args) {
        int arr[] = {5, 10, 15, 5, 5, 15,5,10,15,5,45,47,78,78,12,45,45};
        duplicatehashmap dh = new duplicatehashmap();

        int res = dh.findDuplicate(arr);
        System.out.println(res);
    }
        public int findDuplicate(int[] arr) {


            HashMap<Integer, Integer> countmap = new HashMap<>();
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                if (countmap.containsKey(arr[i])) {
                    int v = countmap.get(arr[i]);
                    countmap.put(arr[i], v + 1);
                } else {
                    countmap.put(arr[i], 1);
                }
            }
            int count = 0;
            for (Integer value : countmap.values()) {
                if (value > 1) {
                    count++;
                }
            }

            return count;
    }
}
