package Exercises.E02DataTypesAndVariables;

import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 97; i <= 97 + number - 1; i++) {
            for (int j = 97; j <= 97 + number - 1; j++) {
                for (int k = 97; k <= 97 + number - 1; k++) {
                    char symbol1 = (char) i;
                    char symbol2 = (char) j;
                    char symbol3 = (char) k;
                    System.out.printf("%c%c%c\n", symbol1, symbol2, symbol3);
                }
            }
        }
    }
}
