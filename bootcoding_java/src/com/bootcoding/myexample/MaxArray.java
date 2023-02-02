package com.bootcoding.myexample;
//Print max element of an array
//Print min element of array

public class MaxArray {
    public static void main(String[] args) {

        int[] num ={12,97,48,72,31,70,1,9,78,28,1,30,82,17,43,44,53,12,73,16,74,24,79,9,
                51,77,36,38,81,38,69,60,29,21,66,6,62,55,13,90,66,7,15,15,60,76,44,30,6,86,
                87,59,88,36,32,35,67,13,79,43,27,2,97,41,4,44,91,11,5,48,38,64,9,90,39,28,
                50,57,60,4,99,44,39,12,95,32,66,10,45,42,22,35,65,7,49,43,41,40,64,78};
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
