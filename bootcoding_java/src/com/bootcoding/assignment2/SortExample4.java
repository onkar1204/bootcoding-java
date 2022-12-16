package com.bootcoding.assignment2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
    public class SortExample4 {
        public static void main(String[] args) {

            //sort list of the element

            List<String> list = new ArrayList<String>();
            list.add("Raja");
            list.add("Banti");
            list.add("Babu");
            list.add("Ram");
            list.add("Babu");
            list.add("Babli");

            Collections.sort(list);

            list.forEach(System.out::println);
            


        }
    }