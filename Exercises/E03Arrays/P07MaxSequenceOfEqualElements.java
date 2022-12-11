package Exercises.E03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxLength = Integer.MIN_VALUE;
        int length = 1;
        int biggestSet = 0;
        for (int i = 0; i < numberArr.length - 1; i++) {

            int currentNumber = numberArr[i];

            if (currentNumber == numberArr[i + 1]) {
                length++;
                if (length > maxLength) {
                    maxLength = length;
                    biggestSet = currentNumber;
                }
            } else {
                length = 1;
            }


        }
        int[] finalArr = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            finalArr[i] = biggestSet;
        }

        for (Integer itemFinal : finalArr) {
            System.out.print(itemFinal + " ");
        }

    }
}
