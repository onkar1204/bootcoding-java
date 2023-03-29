package com.bootcoding.dsa;
//2114. Maximum Number of Words Found in Sentences
public class MaximumNumberofWordsFoundinSentences {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
//        Output: 6
        System.out.println(mostWordsFound(sentences));
    }
    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String text = sentences[i];
            int count = text.split(" ").length;
            if(max < count){
                max = count;
            }
        }
        return max;
    }
}


