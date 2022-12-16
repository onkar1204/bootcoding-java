package com.bootcoding.task;

public class ExFive {
    public static void main(String[] args) {

        ExFive exfive = new ExFive();

        String a="sakshit";
        String b="omkar";

        System.out.println(exfive.number(a,b));

    }
    public boolean number(String a,String b){

        int a1=a.length();

        int b1=b.length();

        if (a1==b1){

            return true;
        }
        return false;
    }

}
