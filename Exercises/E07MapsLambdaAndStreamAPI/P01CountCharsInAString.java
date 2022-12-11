package Exercises.E07MapsLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> charCounter = new LinkedHashMap<>();

        for (char element : input.toCharArray()) {

            if (element == ' ') {
                continue;
            }

            if (!charCounter.containsKey(element)) {
                charCounter.put(element, 1);

            } else if (charCounter.containsKey(element)) {
                int currentCounter = charCounter.get(element);
                charCounter.put(element, currentCounter + 1);
            }
        }
        charCounter.entrySet().forEach(entry -> System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue()));
    }
}
