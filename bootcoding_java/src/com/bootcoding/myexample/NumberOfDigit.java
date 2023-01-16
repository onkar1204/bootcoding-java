package com.bootcoding.myexample;
public class NumberOfDigit {
public static void main(String args[]){

int num = 883083265;
int count = 0;
while(num != 0){
int div = num/10;
count++;
num=div;
}
System.out.println( count);
}
}