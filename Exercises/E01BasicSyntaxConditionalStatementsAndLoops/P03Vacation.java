package Exercises.E01BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupOfThePeople = Integer.parseInt(scanner.nextLine());
        String typeOfTheGroup = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double sum = 0;
        double totalSum = 0;
        switch (typeOfTheGroup) {
            case "Students":
                if (dayOfTheWeek.equals("Friday")) {
                    sum += 8.45;
                } else if (dayOfTheWeek.equals("Saturday")) {
                    sum += 9.80;
                } else if (dayOfTheWeek.equals("Sunday")) {
                    sum += 10.46;
                }
                break;
            case "Business":
                if (dayOfTheWeek.equals("Friday")) {
                    sum += 10.90;
                } else if (dayOfTheWeek.equals("Saturday")) {
                    sum += 15.60;
                } else if (dayOfTheWeek.equals("Sunday")) {
                    sum += 16;
                }
                break;
            case "Regular":
                if (dayOfTheWeek.equals("Friday")) {
                    sum += 15;
                } else if (dayOfTheWeek.equals("Saturday")) {
                    sum += 20;
                } else if (dayOfTheWeek.equals("Sunday")) {
                    sum += 22.50;
                }
                break;
        }
        totalSum = sum * groupOfThePeople;
        if (groupOfThePeople >= 30 && typeOfTheGroup.equals("Students")) {
            totalSum = totalSum * 0.85;
            System.out.printf("Total price: %.2f", totalSum);
        } else if (groupOfThePeople >= 100 && typeOfTheGroup.equals("Business")) {
            totalSum = sum * (groupOfThePeople - 10);
            System.out.printf("Total price: %.2f", totalSum);
        } else if (groupOfThePeople >= 10 && groupOfThePeople <= 20 && typeOfTheGroup.equals("Regular")) {
            totalSum = totalSum * 0.95;
            System.out.printf("Total price: %.2f", totalSum);
        } else {
            System.out.printf("Total price: %.2f", totalSum);
        }
    }
}
