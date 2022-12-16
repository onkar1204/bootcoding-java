package com.bootcoding.task;

public class ExFour {
    public int sum(int []a){
        int sum=0;
        for (int i=0; i < a.length;i++ ){
            if(a[i]>0){
                sum=sum+a[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int a [] = {10,-20,-2,-2};
       ExFour exfour = new ExFour();

        System.out.println(exfour.sum(a));
}

}
