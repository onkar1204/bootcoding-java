package com.bootcoding.basic;

public class FibonacciMethod {
    public int[] getFibonacciOf(int n){
        int res[]=new int[n];
        int p1=1,p2=1,sum=1;
        for(int i=1;i<=n;i++){
            res[i-1] = sum;
            p2=p1;
            p1=sum;
            sum=p1+p2;

        }
        return res;
    }
}
