package Exams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String places = scanner.nextLine();
        String regex = "([=|\\/])([A-Z][A-Za-z]{2,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(places);
        StringBuilder sb = new StringBuilder();
        List<String> finalList = new ArrayList<>();

        while (matcher.find()) {
            String currentWord = "";
            int currentMatchLength = matcher.group().length();

            for (int i = 0; i < currentMatchLength; i++) {
                char symbol = matcher.group().charAt(i);

                if (Character.isLetter(symbol)) {
                    sb.append(symbol);
                    currentWord += symbol;
                }
            }
            finalList.add(currentWord);
        }

        System.out.println("Destinations: " + String.join(", ", finalList));
        System.out.printf("Travel Points: %d%n", sb.length());

    }
}
