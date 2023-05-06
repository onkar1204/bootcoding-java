package com.bootcoding.leetcode;
//771. Jewels and Stones
public class JewelsandStones {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
//        Output: 3
        System.out.println(numJewelsInStones(jewels,stones));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] jewel = jewels.toCharArray();
        char[] stone = stones.toCharArray();
        for (char i : jewel) {
            for (char j : stone) {
                if (i==j) {
                    count++;
                }
            }
        }
        return count;
    }
}
