package Exams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int coolThreshold = 1;
        int count = 0;
        String regex = "([::|**]{2})(?<word>[A-Z][a-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (Character.isDigit(symbol)) {
                coolThreshold *= Integer.parseInt(symbol + "");
            }
        }
        List<String> listAllEmojis = new ArrayList<>();
        int calculations = 0;

        while (matcher.find()) {
            count++;

            for (int i = 0; i < matcher.group("word").length(); i++) {
                char symbol = matcher.group("word").charAt(i);
                calculations += symbol;
            }

            if (calculations >= coolThreshold) {
                listAllEmojis.add(matcher.group());
            }
            calculations = 0;
        }

        System.out.printf("Cool threshold: %d%n", coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", count);

        if (listAllEmojis.size() > 0) {
            for (String element : listAllEmojis) {
                System.out.println(element);
            }
        }
    }
}
