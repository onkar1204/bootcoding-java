package com.bootcoding.basic;

public class FeetTocentimetres {
static double convert (double feet){
    double centimeters = feet*30.48;
    return centimeters;

}

    public static void main(String[] args) {
        double feet = 1;
        double centimeters = convert(feet);
        System.out.printf(feet + " feet " + " is " + centimeters + " centimeters");
    }

}


