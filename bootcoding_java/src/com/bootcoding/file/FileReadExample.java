package com.bootcoding.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            File f = new File("C://File//File.txt"); //"C:\File\File.txt.txt"
            Scanner sc = new Scanner(f);
            System.out.println(" Is File Readable : " + f.canRead());
            System.out.println(" Is File Write : " + f.canWrite());
            System.out.println(" Is File Execute : " + f.canExecute());
            System.out.println(" File Path : " + f.getPath());
            System.out.println(" Absolute File Path : " + f.getAbsolutePath());


            System.out.println(" Reading File Contents:");
            while (sc.hasNext()){
                String line = sc.nextLine();
                System.out.println(line);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
