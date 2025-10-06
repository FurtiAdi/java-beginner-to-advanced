package org.example;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        int number;

        number = random.nextInt(1, 6); //not inclusive of 6 1-5


        System.out.println(number);
    }
}
