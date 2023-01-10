package com.bootcoding.myexample;

// Find the length of a string without using library function (For ex. Hello -> 5)
public class LengthOfString {
    public static void main(String[] args) {

        char[] chars = {'H', 'E', 'L', 'L', 'O'};

        int i;
        int count = 0;

        for (i=0; i<chars.length; i++){
           i = count++;
        }
        System.out.println("Length Of String Is " + count);

//          To Print In Reverse Order

        for (i = chars.length-1; i >= 0; i--) {
            System.out.println( chars[i]);
        }


    }
}
