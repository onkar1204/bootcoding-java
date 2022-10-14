package com.bootcoding.oops.encapsulation;

public class Marker {

    String company;
    String colour;
    String type;
    double price;

    public Marker() {
        System.out.println("Marker object created!");
    }

    public Marker(String cmp, String clr, String t, double p) {


        company = cmp;
        colour = clr;
        type = t;
        price = p;
    }

    public static void main(String[] args) {


        System.out.println("Marker object Created");
        Marker m1 = new Marker();
        m1.company = "Camlin";
        m1.colour = "Black";
        m1.type = "White Marker";
        m1.price = 110.10;

        System.out.println(m1.company);
        System.out.println(m1.colour);
        System.out.println(m1.type);
        System.out.println(m1.price);


        Marker m2 = new Marker();
        m1.company = "Natraj";
        m1.colour = "Blue";
        m1.type = "Blue Marker";
        m1.price = 130.10;

        System.out.println(m1.company);
        System.out.println(m1.colour);
        System.out.println(m1.type);
        System.out.println(m1.price);

        Marker m3 = new Marker();
        m1.company = "Camel";
        m1.colour = "Black";
        m1.type = "Black Marker";
        m1.price = 145.10;

        System.out.println(m1.company);
        System.out.println(m1.colour);
        System.out.println(m1.type);
        System.out.println(m1.price);

        Marker m4 = new Marker();
        m1.company = "Apsara";
        m1.colour = "Black";
        m1.type = "White Marker";
        m1.price = 119.10;

        System.out.println(m1.company);
        System.out.println(m1.colour);
        System.out.println(m1.type);
        System.out.println(m1.price);

        Marker m5 = new Marker("Natraj", "Black", "white", 127.00);
        m5.print();
    }

    public void fillMarker() {
        System.out.println("fill Marker");
    }


    public void print() {

        System.out.println(company);
        System.out.println(colour);
        System.out.println(type);
        System.out.println(price);
    }
}









