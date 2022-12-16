package com.bootcoding.marks;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Random;

public class StudentMarks {

    private static final int MAX_NUMBER = 10;




    public String generateRandomName() {

        String[] name = {"prashil", "sakshit", "yash", "tanmay", "ved", "shantanu"};

        Random r = new Random();

        int bound= r.nextInt(name.length);

        return name[bound];

    }

    public void writeToFile(List<String>data) {
        try {
            File file = new File("c://data//marks.txt");

            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            for(String d:data) {
                fw.write(d);

            }
            fw.close();
            } catch (Exception e) {

        }


    }

    public int generateRandomMarks(){
        Random random = new Random();

        return random.nextInt(99-35);

    }


}