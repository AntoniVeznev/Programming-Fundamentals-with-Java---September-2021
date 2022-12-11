package Exercises.E01BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sumCoins = 0;
        double price = 0;
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1) {
                sumCoins += coins;
            } else if (coins == 0.2) {
                sumCoins += coins;
            } else if (coins == 0.5) {
                sumCoins += coins;
            } else if (coins == 1) {
                sumCoins += coins;
            } else if (coins == 2) {
                sumCoins += coins;
            } else {
                System.out.printf("Cannot accept %.2f\n", coins);
            }
            input = scanner.nextLine();
        }
        String products = scanner.nextLine();
        while (!products.equals("End")) {
            if (products.equals("Nuts")) {
                price = 2.0;
                if (sumCoins >= 2.0) {
                    sumCoins -= price;
                    System.out.printf("Purchased %s\n", products);
                } else if (sumCoins < 2.0) {
                    System.out.println("Sorry, not enough money");
                }
            } else if (products.equals("Water")) {
                price = 0.7;
                if (sumCoins >= 0.7) {
                    sumCoins -= price;
                    System.out.printf("Purchased %s\n", products);
                } else if (sumCoins < 0.7) {
                    System.out.println("Sorry, not enough money");
                }
            } else if (products.equals("Crisps")) {
                price = 1.5;
                if (sumCoins >= 1.5) {
                    sumCoins -= price;
                    System.out.printf("Purchased %s\n", products);
                } else if (sumCoins < 1.5) {
                    System.out.println("Sorry, not enough money");
                }
            } else if (products.equals("Soda")) {
                price = 0.8;
                if (sumCoins >= 0.8) {
                    sumCoins -= price;
                    System.out.printf("Purchased %s\n", products);
                } else if (sumCoins < 0.8) {
                    System.out.println("Sorry, not enough money");
                }
            } else if (products.equals("Coke")) {
                price = 1.0;
                if (sumCoins >= 1.0) {
                    sumCoins -= price;
                    System.out.printf("Purchased %s\n", products);
                } else if (sumCoins < 1.0) {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }
            products = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", Math.abs(sumCoins));
    }
}
