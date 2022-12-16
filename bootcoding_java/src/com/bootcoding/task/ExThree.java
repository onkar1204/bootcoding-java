package com.bootcoding.task;

public class ExThree {
    public static void main(String[] args) {

        double prob = 0.2;
        int prize=50;
        int pay = 9;

        ExThree exthree = new ExThree();

        System.out.println(exthree.argument(prob,prize,pay));
    }
    public boolean argument(double prob, int prize,int pay ){
        double temp = prob*prize;
        if (temp > pay ) {
            return true;
        }
        return false;

    }


}
