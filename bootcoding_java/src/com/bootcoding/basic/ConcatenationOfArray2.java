package com.bootcoding.basic;

import java.util.HashMap;
import java.util.Map;

public class ConcatenationOfArray2 {
    public static void main(String[] args) {
       String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
       String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
//        Output: ["Shogun"]
        String[] res = findRestaurant(list1,list2);
        for (int i=0; i< res.length; i++){
            System.out.println(res[i]);
        }
    }













    public static String[] findRestaurant(String[] list1, String[] list2) {
        Map<Integer , String> map = new HashMap<>();
        String[] list3 = new String[list1.length + list2.length];
        int temp =0;
        for(int i=0; i<list1.length; i++) {
            list3[temp++] = list1[i];
        }
        for (int j=0; j<list2.length; j++){
            list3[temp++] = list2[j];
        }

        return list3;
    }
}
