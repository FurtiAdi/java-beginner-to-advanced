package org.example;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        double total;
        char currency = '$';

        System.out.println("What item would you want to buy? ");
        item = scanner.nextLine();

        System.out.println("What is the price? ");
        price = scanner.nextDouble();

        System.out.println("How many would you like? ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("You have bought " + quantity + " " + item + "\s");
        System.out.println("Your total is " + currency + total);
        scanner.close();
    }
}
