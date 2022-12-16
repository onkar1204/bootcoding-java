package com.bootcoding.marks;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        StudentMarks s = new StudentMarks();


        List<String> data = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {

            String name = s.generateRandomName();
            int physic = s.generateRandomMarks();
            int chemistry = s.generateRandomMarks();
            int maths = s.generateRandomMarks();

            String s1 = name + "," + i + "," + physic + "," + chemistry + "," + maths + "\n";
            System.out.println(s1);
            data.add(s1);
        }

        s.writeToFile(data);
    }
}


