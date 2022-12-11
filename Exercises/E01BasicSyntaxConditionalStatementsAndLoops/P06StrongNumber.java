package Exercises.E01BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int digit = 0;
        int digitsLeft = number;
        int something = 1;
        int fact = 0;
        while (digitsLeft != 0) {
            digit = digitsLeft % 10;
            digitsLeft = digitsLeft / 10;
            something = 1;
            for (int i = 1; i < digit; i++) {
                something += something * i;
            }
            fact += something;
        }
        if (number == fact) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
