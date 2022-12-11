package Exams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mirrorwords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "([@|#])([A-Za-z]{3,})\\1{2}([A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> allUnchangedWords = new ArrayList<>();
        List<String> perfectMatches = new ArrayList<>();
        int count = 0;

        while (matcher.find()) {
            allUnchangedWords.add(matcher.group());
            count++;
            String[] currentMatch = matcher.group().split("[@|#\\s+]+");
            String firstWord = currentMatch[1];
            String secondWord = currentMatch[2];
            String reversedWord = "";

            for (int i = secondWord.length() - 1; i >= 0; i--) {
                char symbol = secondWord.charAt(i);
                reversedWord += symbol + "";
            }
            if (firstWord.equals(reversedWord)) {
                perfectMatches.add(firstWord + " <=> " + secondWord);
            }
        }
        if (allUnchangedWords.size() == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.printf("%d word pairs found!%n", count);
        }

        if (perfectMatches.size() == 0) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
        }
        System.out.println(String.join(", ", perfectMatches));
    }
}
