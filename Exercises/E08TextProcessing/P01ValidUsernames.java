package Exercises.E08TextProcessing;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] usernames = input.split(", ");

        for (int i = 0; i <= usernames.length - 1; i++) {
            String currentName = usernames[i];
            boolean isValid1 = false;
            boolean isValid2 = false;

            if (currentName.length() >= 3 && currentName.length() <= 16) {
                isValid1 = true;
                int count = 0;

                for (int j = 0; j < currentName.length(); j++) {
                    count += 1;
                    char symbol = currentName.charAt(j);

                    if (Character.isLetterOrDigit(symbol) || symbol == '-' || symbol == '_') {

                        if (count == currentName.length()) {
                            isValid2 = true;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (isValid1 && isValid2) {
                System.out.println(currentName);
            }
        }
    }
}
