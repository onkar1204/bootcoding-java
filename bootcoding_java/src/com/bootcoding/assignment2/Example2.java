package com.bootcoding.assignment2;
import java.util.ArrayList;
import java.util.List;
    public class Example2 {
        public static void main(String[] args) {

            //for each Method java8 feature

            List<String> list = new ArrayList<String>();
            list.add("Raja");
            list.add("Banti");
            list.add("Babu");
            list.add("Ram");
            list.add("Babu");
            list.add("Babli");

            list.forEach(str -> System.out.println(str));

        }
    }