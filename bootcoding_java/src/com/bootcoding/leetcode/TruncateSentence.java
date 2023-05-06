package com.bootcoding.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1816. Truncate Sentence
public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
//        Output: "Hello how are you"
        System.out.println(truncateSentence(s,k));
    }
    public static String truncateSentence(String s, int k) {
        String[] str ;
        str = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < k; i++) {
            sb.append(str[i]);
            if(i<k-1) sb.append(" ");
        }
        String str2 = sb.toString();
        return str2;
    }
}
