package com.bootcoding.dsa;

public class NumberOfSteps {

    public int  step(int num ){
        int count =0;
        while(num !=0){
            if (num%2==0){
                num=num/2;
            }
            else {
                num=num-1;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOfSteps a= new NumberOfSteps();
       int c= a.step(123);
        System.out.println(c);
    }

    }

