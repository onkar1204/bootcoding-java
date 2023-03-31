package com.bootcoding.myexample;


    public class ArrayOfStrings
    {
        public static void main(String args[])
        {
            String stringArray[] = {"Hello ", " how", " are", " you", " welcome", " to", " Tutorialspoint"};
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < stringArray.length; i++) {
                sb.append(stringArray[i]);
            }
            String str = sb.toString();
            String[] s = str.split(" ,");
            System.out.println(str);
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
            }
        }
    }

