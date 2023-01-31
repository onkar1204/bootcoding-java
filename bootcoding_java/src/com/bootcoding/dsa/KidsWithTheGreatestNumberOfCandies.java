package com.bootcoding.dsa;

import java.util.ArrayList;
import java.util.List;
public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
       // Output: [true,true,true,false,true]
        KidsWithTheGreatestNumberOfCandies kids = new KidsWithTheGreatestNumberOfCandies();
        for (Boolean res : kids.kidsWithCandies(candies,extraCandies)){
            System.out.println(res);
        }
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list = new ArrayList<>();
        int max = candies[0];
        for (int j = 0; j < candies.length; j++) {
            if (candies[j] > max) {
                max = candies[j];
            }
        }
            for (int i = 0; i < candies.length; i++) {

                if (candies[i] + extraCandies >= max) {
                    list.add(true);
                } else {
                    list.add(false);
                }
            }
            return list;
        }
    }
