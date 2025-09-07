package org.example;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        double amount;
        int years;

        System.out.println("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.println("Enter the interest rate (in%): ");
        rate = scanner.nextDouble()/100;

        System.out.println("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.println("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow((1 + rate / timesCompounded ), (timesCompounded * years));

        System.out.printf("The amount after %d years is $%f", years, amount);

        scanner.close();
    }
}
