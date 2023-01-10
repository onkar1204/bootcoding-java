package com.bootcoding.myexample;

public class NumberOfWordsString {
    public static void main(String[] args) {

        String content = "Rashtrasant Tukdoji Maharaj Nagpur university Is One Of The Best University Nagpur etet    ";

        String[] words =content.split(" ");

        String a = words[words.length-1];

        System.out.println(a.trim().length());


//        int i = 0;
//        int count=0;
//        for ( i=1; i <words.length; i++){
//            i = count++;
//        }
//        System.out.println(count);
}
}
