package com.bootcoding.dsa;

public class ReverseInteger {

    public static void main(String[] args) {
        int x =231;
        int res = reverse(x);
        System.out.println(res);

    }
    public static int reverse(int x) {
        int div = 0;
        int rem =0;

        if (x> Integer.MAX_VALUE || x<  Integer.MIN_VALUE){
            return 0;
        }
        while(x != 0){
            div = x/10;
            rem = rem * 10 + x%10;

            x = div;
        }
        return rem;
    }
}
