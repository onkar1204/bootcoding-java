package com.bootcoding.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample2
{
        public static void main(String[] args) {
            File file = new File("C://data//bottle.txt");
            try {
                Scanner scanner = new Scanner(file);
                String inputText = "bottles";
                int count =0;
                while (scanner.hasNext()){
                    String text = scanner.nextLine();
                    String[] tokens = text.split(" ");
                    for(int i = 0; i< tokens.length; i++) {
                        if (inputText.equals(tokens[i])) {
                            count++;
                        }
                    }
                }
                System.out.println(inputText + " is repeated " + count + " time");
            }catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }catch (Exception ex){
                ex.printStackTrace();
  }
    }
  }