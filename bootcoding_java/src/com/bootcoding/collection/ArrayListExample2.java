package com.bootcoding.collection;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {

        ArrayList<Double> prices = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            prices.add(i * 10+0.5);
        }
        for (int i = 0; i < prices.size(); i++) {
            System.out.println(prices.get(i));
        }
    }
}
