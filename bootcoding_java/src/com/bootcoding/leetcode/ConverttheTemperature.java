package com.bootcoding.leetcode;
//2469. Convert the Temperature
public class ConverttheTemperature {
    public static void main(String[] args) {
        double celsius = 36.50;
//        Output: [309.65000,97.70000]
        double[] res = convertTemperature(celsius);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }
    public static double[] convertTemperature(double celsius) {
        double[] arr = new double[2];
        double k =0 , f =0;
        k=celsius+273.15;
        f=celsius*1.80+32.00;
        arr[0]=k;
        arr[1]=f;

        return arr;
    }
}
