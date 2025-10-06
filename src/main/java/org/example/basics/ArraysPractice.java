package org.example;

import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] numbers = { 1, 9, 2, 8, 3, 5, 4};
        int target = 2;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==target){
                System.out.println("Element found at index" + i);
                isFound = true;
                break;
            }

            add(1, 2, 3, 4);
        }

        if (!isFound){
            System.out.println("Element not found!");
        }

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {fruits, vegetables, meats};
        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

    }

    static int add(int ... numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}
