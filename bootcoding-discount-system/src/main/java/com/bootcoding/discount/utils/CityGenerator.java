package com.bootcoding.discount.utils;

import java.util.Random;

public class CityGenerator {

        private static String[] cities =
                {"Nagpur", "Pune", "Amravti", "Bhandara", "Mumbai"};

        public static String getCity() {
            Random random = new Random();
            int randomIndex = random.nextInt(cities.length);
            return cities[randomIndex];
        }

        public static void main(String[] args) {

        }
    }


