package MoreExercises.E01BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double budget = Double.parseDouble(input);
        double price = 0;
        double totalPurchase = 0;
        boolean isValid = false;
        int counter = 0;

        while (!input.equals("Game Time")) {
            counter++;
            if (counter == 1) {
                input = scanner.nextLine();
            }
            if (input.equals("OutFall 4")) {
                price = 39.99;
                if (budget >= price) {
                    System.out.println("Bought " + input);
                    budget -= price;
                    totalPurchase += price;
                    if (budget == 0) {
                        System.out.println("Out of money!");
                        isValid = true;
                        break;
                    }
                } else if (budget < price) {
                    System.out.println("Too Expensive");
                } else if (budget == 0) {
                    System.out.println("Out of money!");
                    isValid = true;
                    break;
                }
            } else if (input.equals("CS: OG")) {
                price = 15.99;
                if (budget >= price) {
                    System.out.println("Bought " + input);
                    budget -= price;
                    totalPurchase += price;
                    if (budget == 0) {
                        System.out.println("Out of money!");
                        isValid = true;
                        break;
                    }
                } else if (budget < price) {
                    System.out.println("Too Expensive");
                } else if (budget == 0) {
                    System.out.println("Out of money!");
                    isValid = true;
                    break;
                }

            } else if (input.equals("Zplinter Zell")) {
                price = 19.99;
                if (budget >= price) {
                    System.out.println("Bought " + input);
                    budget -= price;
                    totalPurchase += price;
                    if (budget == 0) {
                        System.out.println("Out of money!");
                        isValid = true;
                        break;
                    }
                } else if (budget < price) {
                    System.out.println("Too Expensive");
                } else if (budget == 0) {
                    System.out.println("Out of money!");
                    isValid = true;
                    break;
                }
            } else if (input.equals("Honored 2")) {
                price = 59.99;
                if (budget >= price) {
                    System.out.println("Bought " + input);
                    budget -= price;
                    totalPurchase += price;
                    if (budget == 0) {
                        System.out.println("Out of money!");
                        isValid = true;
                        break;
                    }
                } else if (budget < price) {
                    System.out.println("Too Expensive");
                } else if (budget == 0) {
                    System.out.println("Out of money!");
                    isValid = true;
                    break;
                }
            } else if (input.equals("RoverWatch")) {
                price = 29.99;
                if (budget >= price) {
                    System.out.println("Bought " + input);
                    budget -= price;
                    totalPurchase += price;
                    if (budget == 0) {
                        System.out.println("Out of money!");
                        isValid = true;
                        break;
                    }
                } else if (budget < price) {
                    System.out.println("Too Expensive");
                } else if (budget == 0) {
                    System.out.println("Out of money!");
                    isValid = true;
                    break;
                }
            } else if (input.equals("RoverWatch Origins Edition")) {
                price = 39.99;
                if (budget >= price) {
                    System.out.println("Bought " + input);
                    budget -= price;
                    totalPurchase += price;
                    if (budget == 0) {
                        System.out.println("Out of money!");
                        isValid = true;
                        break;
                    }
                } else if (budget < price) {
                    System.out.println("Too Expensive");
                } else if (budget == 0) {
                    System.out.println("Out of money!");
                    isValid = true;
                    break;
                }
            } else {
                if (!input.equals("OutFall 4") && !input.equals("CS: OG") && !input.equals("Zplinter Zell") && !input.equals("Honored 2") && !input.equals("RoverWatch") && !input.equals("RoverWatch Origins Edition")) {
                    System.out.println("Not Found");
                } else {

                }
            }
            if (isValid) {
                break;
            }

            input = scanner.nextLine();

        }
        if (input.equals("Game Time")) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f\n", totalPurchase, budget);
        }
    }
}
