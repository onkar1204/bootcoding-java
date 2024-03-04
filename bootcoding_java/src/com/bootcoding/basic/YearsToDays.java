package com.bootcoding.basic;

public class YearsToDays {
    static int convert(int years){
        int days = years*365;
        return days;
    }
    public static void main(String[] args) {
        int years =2;
        int days = convert(years);
        System.out.println ( years + " years " + " is " + days + " days "  );
}
}
