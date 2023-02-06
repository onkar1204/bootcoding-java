package com.bootcoding.dsa;

public class Sqrt {
    public static void main(String[] args) {
        int x = 4;
//        Output: 2
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        double temp;
        double sqroot = x/2;
        if(x == 0 || x == 1){
            return x;
        }



        do{
            temp = sqroot;
            sqroot = (temp+(x/temp))/2;
        }
        while(temp - sqroot != 0);
        return (int)Math.floor(sqroot);
    }
}
