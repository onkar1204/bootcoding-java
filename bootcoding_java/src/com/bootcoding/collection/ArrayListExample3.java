package com.bootcoding.collection;

import java.util.ArrayList;

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<String> numbers=new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i * 10 + "");
        }
       for (String number : numbers ){
           System.out.println(number +"");
       }
        System.out.println(numbers);
    }
}
