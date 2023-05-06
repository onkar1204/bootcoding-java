package com.bootcoding.leetcode;

import java.util.Arrays;

//1528. Shuffle String
public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
//        Output: "leetcode"
        ShuffleString sf = new ShuffleString();
        sf.restoreString(s,indices);
        System.out.println(sf.restoreString(s,indices));

    }
    public String restoreString(String s, int[] indices) {
        char[] chars = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
             chars[indices[i]]=s.charAt(i);
        }
        String res = new String(chars);
        return res;
    }
}
