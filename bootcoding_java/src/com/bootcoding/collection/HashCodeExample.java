package com.bootcoding.collection;

import java.util.HashMap;

public class HashCodeExample {
    public static void main(String[] args) {

        HashMapExample hc = new HashMapExample();
        HashMap<Restaurant,Integer> map = new HashMap<>();
        map.put(new Restaurant("Barbeque Nation","Nagpur","NON_VEG"),1);
        map.put(new Restaurant("Haldiram","Nagpur","VEG"),2);
        map.put(new Restaurant("Baba Biryani","Nagpur","NON_VEG"),3);
        map.put(new Restaurant("Chaska","Nagpur","VEG"),4);
        map.put(new Restaurant("Ram Bhandar","Nagpur","VEG"),5);

        System.out.println(map.get(new Restaurant("Ram Bhandar","Nagpur","VEG")));


    }
}
