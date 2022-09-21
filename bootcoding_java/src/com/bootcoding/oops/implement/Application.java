package com.bootcoding.oops.implement;

public class Application {
    public static void main(String[] args) {
        long st = System.nanoTime();

        Hero h = new Hero();
        Atlas a = new Atlas();
        h.test();
        a.test();
        long et = System.nanoTime();

        System.out.println((et-st)/1000 + " micro seconds " );


    }

}
