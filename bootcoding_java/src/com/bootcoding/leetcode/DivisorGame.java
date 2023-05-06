package com.bootcoding.leetcode;
//1025. Divisor Game
public class DivisorGame {
    public static void main(String[] args) {
        int n = 2;
//        Output: true
        System.out.println(divisorGame(n));
    }
    public static boolean divisorGame(int n) {
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
}
