package Exercises.E02DataTypesAndVariables;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int totalSpice = 0;
        int days = 0;

        for (int i = startingYield; i >= 100; i -= 10) {

            totalSpice = totalSpice + i - 26;
            days++;

        }
        if (totalSpice == 0) {
            System.out.println(days);
            System.out.println(totalSpice);
        } else {
            totalSpice -= 26;
            System.out.println(days);
            System.out.println(totalSpice);
        }

    }
}
