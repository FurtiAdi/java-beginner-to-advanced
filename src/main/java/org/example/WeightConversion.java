package org.example;

import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Declare
        double weight;
        double newWeight;
        int choice;

        //welcome message
        System.out.println("Weight Conversion Program!");

        //prompt for user choice
        System.out.println("1:Convert lbs to kgs");
        System.out.println("2:Convert kgs to lbs");

        System.out.println("Choose an option: ");
        choice = scanner.nextInt();

        //option1 convert lbs to kgs
        if(choice==1){
            System.out.println("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("The new weight in kgs is: " + newWeight);
        }else if(choice==2){
            System.out.println("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);
        } else {
            System.out.println("Not a valid choice!");
        }


        //option2 convert kgs to lbs
        //otherwise print not a valid choice

        scanner.close();
    }
}
