package com.bootcoding.task;

public class ExOne {


    public static void main(String[] args) {
        int min = 5;
        int con = conv(5);

        System.out.println( min + " Minute "  + con + " Seconds ");


    }
    static int conv(int min){
        int sec = min*60;
        return sec;
    }

}
