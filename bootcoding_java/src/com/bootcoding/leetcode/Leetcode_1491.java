package com.bootcoding.leetcode;
//    1491. Average Salary Excluding the Minimum and Maximum Salary
import java.util.Arrays;

public class Leetcode_1491 {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
//        Output: 2500.00000
        System.out.println(average(salary));
    }
    public static double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0;
        double count = 0;
        for (int i = 1; i < salary.length-1; i++) {
            sum=sum+salary[i];
            count++;
        }
        return sum/count;

    }
}
