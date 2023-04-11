package com.bootcoding.dsa;
//2042. Check if Numbers Are Ascending in a Sentence
public class CheckifNumbersAreAscendinginaSentence {
    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
//        Output: true
        System.out.println(areNumbersAscending(s));
    }
    public static boolean areNumbersAscending(String s) {
        int pre = 0;
        for (int i = 0; i < s.length(); i++) {
            String[] str = s.split(" ");
            try {
                int nums = Integer.parseInt(str[i]);
                if (nums <= pre){
                    return false;
                }
                pre=nums;
                System.out.println(str[i]);
            }
            catch (Exception e){

            }
        }



    return true;
    }
}
