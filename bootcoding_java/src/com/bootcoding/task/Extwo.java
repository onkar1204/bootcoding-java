package com.bootcoding.task;

public class Extwo {
    static int convert(int years){
        int days = years*365;
        return days;

    }

    public static void main(String[] args) {

        int years =1;
        int days = convert(years);


        System.out.println (  years + " years " + days +   " days "  );

    }
}



