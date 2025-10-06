package org.example;

import java.util.Random;
import java.util.Scanner;

public class SlotMachineProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double balance = 100;
        int bet;
        int payout;
        String playAgain;
        String[] row;

        System.out.println("***********************");
        System.out.println(" Welcome to Java Slots ");
        System.out.println("Symbols: 🎁 🌹 ✌ ❤ 🎂 ");
        System.out.println("***********************");

        while(balance>0){
            System.out.println("Current balance: $" + balance);
            System.out.println("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if (bet>balance){
                System.out.println("Insufficient Funds!");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0!");
            } else {
                balance -= bet;
            }

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if (payout>0){
                System.out.println("You won $" + payout);
                balance += payout;
            }else {
                System.out.println("You lost this round!");
            }
            System.out.println("Do you want to play again? (yes/no) ");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("yes")){
                break;
            }
        }

        System.out.println("Game Over! Your final balance is $" + balance);
        scanner.close();
    }

    private static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[1]){
                case "🎁" -> bet * 3;
                case "🌹" -> bet * 4;
                case "✌" -> bet * 5;
                case "❤"-> bet * 10;
                case "🎂" -> bet * 20;
                default -> 0;
            };
        }else if (row[0].equals(row[1]) ||
        row[1].equals(row[2])){
            return switch (row[1]){
                case "🎁" -> bet * 2;
                case "🌹" -> bet * 3;
                case "✌" -> bet * 4;
                case "❤"-> bet * 5;
                case "🎂" -> bet * 6;
                default -> 0;
            };
        }
        return bet;
    }
    private static String[] spinRow() {
        String[] symbols = {"🎁", "🌹", "✌", "❤", "🎂"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    private static void printRow(String[] row){
        System.out.println("***************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("***************");
    }
}
