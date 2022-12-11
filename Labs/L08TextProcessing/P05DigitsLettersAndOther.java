package Labs.L08TextProcessing;

import java.util.Scanner;

public class P05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder digit = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder otherStuff = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            char symbol = input.charAt(i);

            if (Character.isDigit(symbol)) {
                digit.append(symbol);

            } else if (Character.isAlphabetic(symbol)) {
                letters.append(symbol);

            } else {
                otherStuff.append(symbol);
            }
        }
        System.out.println(digit);
        System.out.println(letters);
        System.out.println(otherStuff);
    }
}
