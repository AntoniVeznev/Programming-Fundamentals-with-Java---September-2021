package Exercises.E03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int topInteger = 0;

        for (int i = 0; i < numbers.length; i++) {

            int currentNumber = numbers[i];

            if (i == numbers.length - 1) {
                topInteger = currentNumber;
                System.out.print(topInteger + " ");
                break;
            }

            for (int index = i + 1; index < numbers.length; index++) {

                if (currentNumber > numbers[index]) {
                    topInteger = currentNumber;

                } else {
                    topInteger = 0;
                    break;
                }
            }

            if (topInteger != 0) {
                System.out.print(topInteger + " ");

            }
        }
    }
}
