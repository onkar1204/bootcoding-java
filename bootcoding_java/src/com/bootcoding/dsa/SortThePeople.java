package com.bootcoding.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortThePeople {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        //Output: ["Mary","Emma","John"]
        for (String st :sortPeople(names,heights) ){
            System.out.println(st);
        }
    }
    public static String[] sortPeople(String[] names, int[] heights) {
       Map<Integer , String> map = new HashMap<>();

       for (int i=0; i< names.length; i++){
           map.put(heights[i] ,names[i]);
           }
        Arrays.sort(heights);
       String[] res = new String[names.length];
        int index = 0;
       for (int a= heights.length-1; a>=0; a--){
           res[index] = map.get(heights[a]);
           index++;
       }
       return res;
    }
}
