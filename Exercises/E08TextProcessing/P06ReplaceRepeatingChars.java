package Exercises.E08TextProcessing;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder builder = new StringBuilder(input);

        for (int i = 0; i < builder.length() - 1; i++) {
            char symbol1 = builder.charAt(i);
            char symbol2 = builder.charAt(i + 1);

            if (symbol1 == symbol2) {
                builder.deleteCharAt(i + 1);
                i--;
            }
        }
        System.out.println(builder);
    }
}
