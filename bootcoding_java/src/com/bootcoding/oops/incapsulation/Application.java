package com.bootcoding.oops.incapsulation;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Date st = new Date();

        Marker2 m1=new Marker2();
        m1.setCompany("Apsara");
        m1.setColour("Red");
        m1.setType("Wite Marker");
        m1.setPrice(127.00);

        System.out.println(m1.getCompany());
        System.out.println(m1.getType());
        System.out.println(m1.getColour());
        System.out.println(m1.getPrice());

        Marker2 m2 = new Marker2("Cello", "BLUE", "WHITEBOARD", 138.00);
        System.out.println(m2.getCompany());
        System.out.println(m2.getType());
        System.out.println(m2.getColour());
        System.out.println(m2.getPrice());







        Books javabooks=new Books();
        javabooks.setDescription("Philosophy book");
        javabooks.setAuthor("Charles Dickens");
        javabooks.setPages(500);
        javabooks.setPublisherName(" desktop publishing");
        javabooks.setTitle("The Friends");
        System.out.println(javabooks.getPages());
        System.out.println(javabooks.getDescription());
        System.out.println(javabooks.getAuthor());
        System.out.println(javabooks.getTitle());
        System.out.println(javabooks.getPublisherName());






        Dog d = new Dog();
        d.bark();
        d.eat();
        d.run();
       //d.sleep();

     Date et = new Date();
        System.out.println(et.getTime()-st.getTime() + " ms");




        Cycle c = new Cycle();
    }

}
