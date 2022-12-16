package com.bootcoding.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteExample {
    public static void main(String[] args) {


        try {
            File file = new File("C://file//sakshi.txt");
            if (file.createNewFile()){
                System.out.println(" File Has Been Created");


            }else{
                System.out.println(" File Exist Already");
            }
            System.out.println(" Is File Readable : " + file.canRead());
            System.out.println(" Is File Write : " + file.canWrite());
            System.out.println(" Is File Execute : " + file.canExecute());
            System.out.println(" File Path : " + file.getPath());
            System.out.println(" Absolute File Path : " + file.getAbsolutePath());

            FileWriter fw = new FileWriter(file);
            fw.write("sakshi ladka hai");
            fw.close();

            System.out.println(" File Contents");

            Scanner sc = new Scanner(file);
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
