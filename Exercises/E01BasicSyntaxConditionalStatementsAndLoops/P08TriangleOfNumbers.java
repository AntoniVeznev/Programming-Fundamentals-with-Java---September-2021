package Exercises.E01BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P08TriangleOfNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int colons = 1; colons <= number; colons++) {
            System.out.println();
            for (int i = 1; i <= colons; i++) {
                System.out.print(colons + " ");

            }
        }
    }
}
