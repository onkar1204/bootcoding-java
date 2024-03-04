package com.bootcoding.sorting;

public class BubleSort {
    public static void main(String[] args) {
        int a[] = {100, 30, 70, 40, 55};
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[i]) {


                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
}
