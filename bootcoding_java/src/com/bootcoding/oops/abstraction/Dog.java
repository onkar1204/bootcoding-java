package com.bootcoding.oops.abstraction;


public class Dog extends Animal {

    public void eat(){
        System.out.println("Dog is eating");
    }
    public void sound(){
        System.out.println("Dog sound is diffrent");
    }
    public void run(){
        System.out.println("Dog run fast");
    }
    public void sleep(){
        super.sleep();
        System.out.println("Im Dog and Im Sleeping");
    }
}
