package com.bootcoding.oops.abstraction;

public abstract class Animal {
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    public void see(){
        System.out.println("Animal watching");
    }
    public abstract void eat();
    public abstract void sound();
    public abstract void run();



}
