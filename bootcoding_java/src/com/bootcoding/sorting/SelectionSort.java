package com.bootcoding.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int min=0;
        int a[] = {100,30,70,40,55};
        int n = a.length;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }

        for(int i=0; i< n; i++){
            System.out.println(a[i]);
        }
    }
}
