package com.bootcoding.assignment2;
import java.util.ArrayList;
import java.util.List;
    public class Example1 {
        public static void main(String[] args) {

            //for each loop

            List<String> list = new ArrayList<String>();
            list.add("Raja");
            list.add("Banti");
            list.add("Babu");
            list.add("Ram");
            list.add("Babu");
            list.add("Babli");

            for(String str:list){
                System.out.println(str);
            }
        }
    }