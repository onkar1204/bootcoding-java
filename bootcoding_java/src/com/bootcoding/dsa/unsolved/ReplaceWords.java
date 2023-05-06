package com.bootcoding.dsa.unsolved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//648. Replace Words
public class ReplaceWords {
    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<>();
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("rat");

        String sentence = "the cattle was rattled by the battery";
//        Output: "the cat was rat by the bat"
        }

    public static void replaceWords(List<String> dictionary, String sentence) {
        Collections.sort(dictionary);
        String res =" ";
        String[] str = sentence.split(" ");
        for (int i = 0; i < dictionary.size(); i++) {
            for (int j = 0; j < str.length; j++) {
                if (str[j].startsWith(dictionary.get(i))){
                    str[j].replace(str[j], dictionary.get(i));
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            res = res + str[i];
            System.out.println(str[i]);
        }
    }
}
