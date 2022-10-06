package com.bootcoding.collection;

public class StringEqual {
    public static void main(String[] args) {
        String s1 = "BOOTCODING";

        String s2 = new String("BOOTCODING");

        String s3 =  "BOOTCODING";

        if(s1==s2){
            System.out.println(" REF OF S1 & S2 ARE SAME " );
        }
        else{
            System.out.println("REF OF S1 & S2 ARE NOT SAME");
        }
        if(s1==s3){
            System.out.println(" REF OF S1 & S3 ARE SAME " );
        }
        else{
            System.out.println("REF OF S1 & S3 ARE NOT SAME");
        }

    }
}
