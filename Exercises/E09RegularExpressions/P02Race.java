package Exercises.E09RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> namesList = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        Map<String, Integer> nameDistance = new LinkedHashMap<>();
        namesList.forEach(e -> nameDistance.put(e, 0));
        String input = scanner.nextLine();
        String regexName = "[A-Za-z]+";
        Pattern patternName = Pattern.compile(regexName);
        String regexDistance = "[0-9]";
        Pattern patternDistance = Pattern.compile(regexDistance);

        while (!input.equals("end of race")) {
            StringBuilder builder = new StringBuilder();
            Matcher matcherName = patternName.matcher(input);

            while (matcherName.find()) {
                builder.append(matcherName.group());
            }
            int totalSum = 0;
            Matcher matcherDistance = patternDistance.matcher(input);

            while (matcherDistance.find()) {
                totalSum += Integer.parseInt(matcherDistance.group());
            }
            String racerName = builder.toString();

            if (nameDistance.containsKey(racerName)) {
                int current = nameDistance.get(racerName);
                nameDistance.put(racerName, current + totalSum);
            }
            input = scanner.nextLine();
        }
        List<String> firstTreeNames = nameDistance.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
        System.out.println("1st place: " + firstTreeNames.get(0));
        System.out.println("2nd place: " + firstTreeNames.get(1));
        System.out.println("3rd place: " + firstTreeNames.get(2));
    }
}
