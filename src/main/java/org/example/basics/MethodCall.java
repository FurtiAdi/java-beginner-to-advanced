package org.example;

import java.util.Scanner;

public class MethodCall {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        if(!name.isEmpty() && age!=0) {
            happyBirthday(name, age);
        }

        double doubledAge = add(age, age);
        System.out.println(doubledAge);
    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to you");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }

    //overloaded methods
    static double add(double a, double b){
        return a + b;
    }

    static double add(double a, double b, double c){
        return a + b + c;
    }


}
