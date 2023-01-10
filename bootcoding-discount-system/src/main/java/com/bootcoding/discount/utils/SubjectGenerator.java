package com.bootcoding.discount.utils;

import java.util.Random;

public class SubjectGenerator {

        private static String[] sub =
                {"Hindi", "Marathi", "English", "Maths","Science"};

        public static String getSub() {
            Random random = new Random();
            int randomIndex = random.nextInt(sub.length);
            return sub[randomIndex];
        }

        public static void main(String[] args) {SubjectGenerator.getSub();}
}
