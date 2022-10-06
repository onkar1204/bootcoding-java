package com.bootcoding.collection;

import java.util.ArrayList;
public class CallByReferance {
    public static void main(String[] args) {
        ArrayList< Integer> numbers = new ArrayList<>();
        for(int i=1; i<=10; i++){
            numbers.add(i*10);
        }

        passByValue (numbers);
        System.out.println();
        for(int i=0; i<numbers.size(); i++){
            System.out.print(numbers.get(i) + " ");
        }
    }
    public static void passByValue(ArrayList <Integer> num){
        for(int i=0; i<num.size(); i++){
            num.remove(0);
            num.add(i*20);
        }
        for(int i=0; i<num.size(); i++){
            System.out.print(num.get(i) + " ");
        }
    }
}
