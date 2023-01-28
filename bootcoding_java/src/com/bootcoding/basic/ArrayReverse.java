package com.bootcoding.basic;

public class ArrayReverse {
    public static void main(String[] args) {
        int a[] = {5, 7, 8, 11, 13,34,58};
        int n = a.length;

        for (int i = 0; i<n; i++){
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < n/2; i++){
            int temp = a[i];
            a[i] = a[n-1-i];
            // a[0] = a[4]
            // a[1] = a[3];
            a[n-1-i] = temp;
        }
        System.out.println("\n After Reverse");
        for (int i = 0; i<n; i++){
            System.out.print(a[i] + " ");

        }
    }
}
