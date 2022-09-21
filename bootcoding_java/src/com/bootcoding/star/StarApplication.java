package com.bootcoding.star;

public class StarApplication {
    public static void main(String[] args) {
        //System.out.println("*");
        // System.out.println("**");


        /*
        * Pyramid Output
        *       *
        *       * *
        *       * * *
        *       * * * *
        *       * * * * *
        *
        *
        * */
        for (int i=0;i<10;i++){
            for (int a=0;a<=i;a++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int b=10;b>0;b--) {


            for (int c=0; c<b; c++) {

                System.out.print("*");
            }
            System.out.println();
        }


        /*

        ********
        ***  ***
        **    **
        *      *

         */






    }

}
