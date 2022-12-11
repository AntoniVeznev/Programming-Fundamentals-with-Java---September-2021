package Exercises.E08TextProcessing;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder build = new StringBuilder(line);
        int strength = 0;

        for (int i = 0; i < build.length(); i++) {
            char currentSymbol = build.charAt(i);

            if (currentSymbol == '>') {
                strength += Integer.parseInt("" + build.charAt(i + 1));

            } else if (strength > 0 && currentSymbol != '>') {
                build.deleteCharAt(i);
                strength--;
                i--;
            }
        }
        System.out.println(build);
    }
}
