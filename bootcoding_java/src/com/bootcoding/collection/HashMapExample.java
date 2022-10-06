package com.bootcoding.collection;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,String> emailids = new HashMap<>();

        emailids.put("std-123","IamCoder@gmail.com");
        emailids.put("std-333","IamJavadevloper@gmail.com");


        String emails = emailids.get("std-333");
        System.out.println("Value Of std-333 = " + emails);

    }
}
