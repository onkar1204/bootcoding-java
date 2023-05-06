package com.bootcoding.interview;

import java.util.Scanner;

public class BeautifulPath {
    public static int beauty(int n, int m, String s, int[] x, int[] y) {
        int count = 0;
        int maxi = 0;
        for (char i : s.toCharArray()) {
            for (char j : s.toCharArray()) {
                if (i == j) {
                    count++;
                }
            }
            if (count > maxi) {
                maxi = count;
            }
            count = 0;
        }
        if (maxi == 1) {
            maxi = -1;
        }
        return maxi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        int[] x = new int[m];
        for (int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
        }
        int[] y = new int[m];
        for (int i = 0; i < m; i++) {
            y[i] = sc.nextInt();
        }
        System.out.println(beauty(n,m,s,x, y));
    }
}