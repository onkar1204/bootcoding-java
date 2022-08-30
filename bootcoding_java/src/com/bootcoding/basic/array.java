package com.bootcoding.basic;

public class array {
    public static void main(String[] args) {
        int age[]= {21,20,19,24,25};

        int rollno[]= new int [5];
        rollno[0] = 21;
        rollno[1] = 20;
        rollno[2] = 19;
        rollno[3] = 24;
/*
int count = 0;

        System.out.println(rollno[count]);
        count = count  + 1;
        System.out.println(rollno[count]);
        count = count  + 1;
        System.out.println(rollno[count]);
        count = count  + 1;
        System.out.println(rollno[count]);
        count = count  + 1;
        System.out.println(rollno[count]);*/


        for(int count=0; count < 5; count++){
            System.out.println(rollno[count]);
        }


    }

}
