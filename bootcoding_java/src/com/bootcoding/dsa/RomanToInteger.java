package com.bootcoding.dsa;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        //Output: 58
        System.out.println("Sum of Roman To Integer : "+romanToInt(s));
    }
    public static int romanToInt(String s) {
        Map<Character , Integer> rom = new HashMap<>();
        rom.put('I' , 1);
        rom.put('V' , 5);
        rom.put('X' , 10);
        rom.put('L' , 50);
        rom.put('C' , 100);
        rom.put('D' , 500);
        rom.put('M' , 1000);

       s = s.replace("IV" , "IIII");
       s = s.replace("IX" , "VIIII");
       s = s.replace("XL" , "XXXX");
       s = s.replace("XC" , "LXXXX");
       s = s.replace("CD" , "CCCC");
       s = s.replace("CM" , "DCCCC");

        int num = 0;
        for (int i=0; i<s.length(); i++){
            num = num + rom.get(s.charAt(i));
        }
        return num;
    }
}
