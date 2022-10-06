package com.bootcoding.collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {


        ArrayList age=new ArrayList();

        for (int i=1;i<=10;i++){
            age.add(i*10);
        }
        for (int i=0;i<age.size();i++){
            System.out.println(age.get(i));
        }



    }
}
