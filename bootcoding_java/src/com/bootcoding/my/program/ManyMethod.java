package com.bootcoding.my.program;
import java.util.Scanner;
public class ManyMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length Of Array");
        int s = sc.nextInt();
        int[] num = new int[s];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter number ");
            num[i] = sc.nextInt();
        }
        int min = getMin(num);
        System.out.println("Minimum Element Of Array " + min);
        int max = getMax(num);
        System.out.println("Maximun Element Of Array " + max);
        int length = getLength(num);
        System.out.println("Length Of Array " + length);
        reverse(num);
        getEven(num);
        getOdd(num);
    }
    private static int getMin(int[] num) {
        int min = num[0];
        for (int a = 0; a < num.length; a++) {
            if (num[a] < min) {
                min = num[a];
            }
        }
        return min;
    }
    private static int getMax(int[] num){
        int max = num[0];
        for (int b=0; b< num.length; b++){
            if (num[b] > max){
                max = num[b];
            }
        }
        return max;
    }
    private static int getLength(int[] num){
        int count = 0;

        for (int i=0; i<num.length; i++){
            i = count++;
        }
        return count;
    }
    private static void reverse(int[] num) {
        int i;
        for (i = num.length-1; i >=0; i--) {
            System.out.print(num[i]);
        }
        System.out.println();
    }
    private static void getEven(int[] num){
        int even = 0;
        for (int i=0; i< num.length; i++) {
            if (num[i] % 2 == 0){
                System.out.println(" Even  " + num[i]);
            }
            }
    }
    private static void getOdd(int[] num){
        for (int i=0; i<num.length; i++){
            if (num[i] % 2 != 0){
                System.out.println("Odd " + num[i]);
            }
        }
    }
}
