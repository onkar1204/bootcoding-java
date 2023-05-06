package com.bootcoding.leetcode;

public class DefanginganIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
//        Output: "1[.]1[.]1[.]1"
        System.out.println(defangIPaddr(address));
    }
    public static String defangIPaddr(String address) {

        String str = address.replace("." , "[.]");
        return str;
    }
}
