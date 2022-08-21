package com.bootcoding.basic;

public class Laptop {
    String color;
    int size;
    double price;

    String unit;



    String getcolor () {


        return color;

    }


     public void start() {
        System.out.println("start");

    }

    public static void main(String[] args) {
        Laptop hp =new Laptop();
        Laptop asus =new Laptop();

        hp.color="Red";
        hp.size = 15;
        hp.price = 10000.50;
        hp.start();

    }

}
