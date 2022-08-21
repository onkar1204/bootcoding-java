package com.bootcoding.basic;

import org.w3c.dom.ls.LSOutput;

public class MinutesToSecond {

   static int convert(int minutes){
        int seconds = minutes*60;
        return seconds;
    }

    public static void main(String[] args) {
       int minute = 8;
        int convert = convert(8);
        System.out.println(convert);
        System.out.println( minute +" minute" + " -> " + convert +" seconds");

        System.out.println(minute + " minutes " + "is " + convert + " seconds");
        System.out.println(" input was " + minute + "  minutes " +  "output is " + convert + " seconds"  );
    }



}
