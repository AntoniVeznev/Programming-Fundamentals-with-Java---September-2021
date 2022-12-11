package Exercises.E08TextProcessing;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArr = scanner.nextLine().split(" +");
        String first = stringArr[0].trim();
        String second = stringArr[1].trim();
        int totalSum = 0;
        for (int i = 0; i < Math.max(first.length(), second.length()); i++) {

            if (i < first.length() && i < second.length()) {
                totalSum += first.charAt(i) * second.charAt(i);

            } else if (i < first.length()) {
                totalSum += first.charAt(i);

            } else {
                totalSum += second.charAt(i);
            }
        }
        System.out.println(totalSum);
    }
}
