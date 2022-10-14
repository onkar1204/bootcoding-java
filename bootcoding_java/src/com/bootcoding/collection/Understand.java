package com.bootcoding.collection;

import java.util.ArrayList;

public class Understand {

        public static void main(String[] args) {
            ArrayList a=new ArrayList();
            a.add(10);
            a.add(20);

            a.add(30);
            a.add(2,25);
            System.out.println(a.get(2));
        }

}
