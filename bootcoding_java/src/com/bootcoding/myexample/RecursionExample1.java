package com.bootcoding.myexample;
// WAP to sum of numbers from 1 to n using recursion
public class RecursionExample1 {
    public int printNumber(int num){
        //base condition or terminate condition
        if(num == 1){
            return 1;
        }
        int res = num + printNumber(num-1);
//        System.out.println(res);
       return res ;
    }
    public static void main(String[] args) {
        int num = 20;
        RecursionExample1 recursionExample = new RecursionExample1();
        System.out.println( recursionExample.printNumber(num));
    }
    // 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 +

    // [10,20,30]
    // contageous memory location
    // data value
    // [data, next] -> [data, next]
    // [10, address of next element] -> [20, address of next eleemnt] -> [30, null]
}
