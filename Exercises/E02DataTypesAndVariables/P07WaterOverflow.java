package Exercises.E02DataTypesAndVariables;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterTank = 255;
        int totalLitres = 0;
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            int quantities = Integer.parseInt(scanner.nextLine());
            if (waterTank >= quantities) {
                waterTank -= quantities;
                totalLitres += quantities;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(totalLitres);
    }
}
