package com.bootcoding.myexample;
//Print max element of an array
//Print min element of array

public class MaxArray {
    public static void main(String[] args) {

        int[] num ={10,20,35,25,15,45,40};
        int max =num[0];
        int min = num[0];
        for (int i=0; i<num.length; i++){

            if (num[i]>max){
             max=num[i];
            }
            if (num[i]<min){
                min=num[i];
            }

        }
        System.out.println("Maximum Element Of Array " + max);
        System.out.println("Minimum Element Of Array "+ min);
    }
}
