package org.example;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter temperature: ");
        temp = scanner.nextDouble();

        System.out.println("Convert to Celsius or Farenhet? (C/F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? ((temp - 32) * 5 / 9) : ((temp * 5 / 9) + 32);

        System.out.printf("%.1f %s", newTemp, unit);

        scanner.close();
    }
}
