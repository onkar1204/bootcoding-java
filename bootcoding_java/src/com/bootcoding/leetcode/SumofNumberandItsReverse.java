package com.bootcoding.leetcode;
//2443. Sum of Number and Its Reverse
public class SumofNumberandItsReverse {
    public static void main(String[] args) {
        int num = 181;
       /* Output: true
        Explanation: 172 + 271 = 443 so we return true.*/
        System.out.println(sumOfNumberAndReverse(num));
    }
    public static boolean sumOfNumberAndReverse(int num) {
        if (num == 0)return true;

        for (int i = num/2; i < num; i++) {
            int reverse =0;
            int ori = i;
            while(ori != 0) {
                int remainder = ori % 10;
                reverse = reverse * 10 + remainder;
                ori = ori/10;
            }
            if (i + reverse == num){
                return true;
            }
        }
        return false;
    }
}
