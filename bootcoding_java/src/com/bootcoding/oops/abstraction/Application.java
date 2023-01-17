package com.bootcoding.oops.abstraction;

public class Application {
    public static void main(String[] args) {

        Animal d = new Dog();
        Animal c = new Cat();
        Animal g = new Goat();
        test(d);
    }
    public static void test(Animal a){
        if(a instanceof Cat){
            // processing for cat
        }else if (a instanceof  Dog){
            // processing for dog
        }
    }
}
