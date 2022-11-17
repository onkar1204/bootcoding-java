package com.bootcoding.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArithmaticFileExample {
    public static void main(String[] args) {

        try {
            File file = new File("C://data//numbers//input.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
            int sum = 0;
            int multi = 1;
                String text = scanner.nextLine();
                String[] tokens = text.split(",");
                for (int i = 0; i < tokens.length; i++) {
                    sum = sum + Integer.parseInt(tokens[i]);
                    multi = multi * Integer.parseInt(tokens[i]);

                    System.out.print(tokens[i] + "," );
                }
                System.out.print(sum+"," );

                System.out.println(multi);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
