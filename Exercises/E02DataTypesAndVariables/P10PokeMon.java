package Exercises.E02DataTypesAndVariables;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int firstPokePower = pokePower;
        int count = 0;

        while (pokePower >= distance) {
            pokePower -= distance;
            count++;
            if (pokePower == firstPokePower * 0.5) {
                if (pokePower >= exhaustionFactor) {
                    if (exhaustionFactor != 0) {
                        pokePower = pokePower / exhaustionFactor;
                    } else {
                        continue;
                    }
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(count);
    }
}
