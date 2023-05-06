package com.bootcoding.dsa;
//1523. Count Odd Numbers in an Interval Range
public class CountOddNumbersinanIntervalRange {
    public static void main(String[] args) {
       int low = 327296043, high = 769434803;
//        Output: 221069381
        System.out.println(countOdds(low,high));
    }
    public static int countOdds(int low, int high) {
        int odd =(high-low)/2;
        if (high % 2 == 1 || low % 2 == 1){
            odd++;
        }
        return odd;
    }
    /*public static int countOdds(int low, int high) {
        int count = 0;
        for (int i = low; i <=high ; i++) {
            if (i % 2 != 0){
                count++;
            }
        }
        return count;
    }*/
}
