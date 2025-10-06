package org.example;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row;
        int column;
        char symbol;

        System.out.println("Enter the number of rows: ");
        row = scanner.nextInt();

        System.out.println("Enter the number of column: ");
        column = scanner.nextInt();

        System.out.println("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        for (int i=0; i<row; i++){
            for (int j = 0; j < column; j++) {
                System.out.print(symbol);
                System.out.print(" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
