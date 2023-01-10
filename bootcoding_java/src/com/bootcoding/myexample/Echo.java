package com.bootcoding.myexample;

import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        String line;
        String line2;
        Scanner in = new Scanner(System.in);


        System.out.println("Type Something: ");
        line = in.nextLine();
        System.out.println(" You Said: " + line);
        System.out.println(" Type Something Else: ");
        line2 = in.nextLine();
        System.out.println(" You Also Said: " + line2);
    }
}
