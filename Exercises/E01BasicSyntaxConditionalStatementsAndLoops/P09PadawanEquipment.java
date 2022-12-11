package Exercises.E01BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyAmount = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightSabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());
        int freeBelts = 0;
        double totalSum = 0;
        freeBelts += studentsCount / 6;
        totalSum = lightSabersPrice * ((studentsCount + (Math.ceil(studentsCount * 0.1)))) + robesPrice * studentsCount + beltsPrice * (studentsCount - freeBelts);
        if (totalSum <= moneyAmount) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(totalSum - moneyAmount));
        }
    }
}
