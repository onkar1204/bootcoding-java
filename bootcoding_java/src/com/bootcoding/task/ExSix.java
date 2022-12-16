package com.bootcoding.task;

public class ExSix {

    public static void main(String[] args) {

        ExSix exSix = new ExSix();

        System.out.println(exSix.checkInteger(9,11));
    }

    public boolean checkInteger(int a, int b){

        if (a==10 || b==10){
            return true;
        }
        if ((a+b)==10){
            return true;
        }
        return false;
    }
}
