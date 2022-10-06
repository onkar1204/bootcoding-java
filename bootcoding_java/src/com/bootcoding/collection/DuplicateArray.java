package com.bootcoding.collection;

import java.util.HashMap;

public class DuplicateArray {
    public static void main(String[] args) {
        int dup[]={10,10,30,30,10};

        HashMap<Integer, Integer> data = new HashMap<>();

        for(int i=0; i<dup.length;i++){
            int count = 0;
            if(data.containsKey(dup[i])){
               count =  data.get(dup[i]);
            }
            data.put(dup[i], ++count);
        }

        int max = 1;
        int res = 0;
        for(int key : data.keySet()){
            if(max < data.get(key)){
                max = data.get(key);
                res = key;
            }
        }
        System.out.println(res);
    }
}
