package com.bootcoding.star;

public class StartApplication2 {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i <n; i++){ // number of lines

            for(int j=0; j<=(n-i); j++){
                System.out.print("*");
            }
            for(int s=0; s < i * 2; s++){
                System.out.print(" ");
            }
            for(int k = 0; k <= (n-i); k++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
