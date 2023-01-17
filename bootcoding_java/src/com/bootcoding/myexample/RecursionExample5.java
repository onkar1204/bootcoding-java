package com.bootcoding.myexample;
//WAP to find the sum of digits of a number using recursion
public class RecursionExample5 {

    public static int sumOfDigit(int num, int sum){

            if(num == 0){
                return sum;
            }
            sum = sum + num %10;
        return sumOfDigit((num/10), sum);

        }
        public static void main(String[] args) {
            int num = 883083265;
            int sum = 0;
            RecursionExample5 recursionExample = new RecursionExample5();
            System.out.println(sumOfDigit(num,sum));
        }
    }


