package Labs.L08TextProcessing;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banList = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < banList.length; i++) {
            String currentWord = banList[i];

            if (text.contains(currentWord)) {
                String replacement = "";

                for (int j = 0; j < currentWord.length(); j++) {
                    replacement += replacement.replace(replacement, "*");
                }

                text = text.replace(currentWord, replacement);
            }
        }
        System.out.println(text);
    }
}
