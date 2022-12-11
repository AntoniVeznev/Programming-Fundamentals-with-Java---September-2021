package Exams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textString = scanner.nextLine();
        String regex = "([#||])(?<itemName>[A-Za-z ]+)(\\1)(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(textString);
        int totalCalories = 0;
        int days = 0;
        List<String> stringList = new ArrayList<>();

        while (matcher.find()) {
            String itemName = matcher.group("itemName");
            String data = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
            String calo = matcher.group("calories");
            stringList.add(itemName);
            stringList.add(data);
            stringList.add(calo);
            totalCalories += calories;
        }
        days = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);

        for (int i = 0; i < stringList.size(); i += 3) {
            String itemName = stringList.get(i);
            String data = stringList.get(i + 1);
            String calories = stringList.get(i + 2);
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n", itemName, data, calories);
        }
    }
}
