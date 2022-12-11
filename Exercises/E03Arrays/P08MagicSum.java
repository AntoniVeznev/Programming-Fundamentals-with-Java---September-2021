package Exercises.E03Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= numberArr.length - 1; i++) {
            int currentNumber = numberArr[i];
            int sum = 0;

            for (int j = i+1; j <= numberArr.length - 1; j++) {
                sum += currentNumber + numberArr[j];

                if (sum == number) {
                    System.out.print(currentNumber + " ");
                    System.out.print(numberArr[j]);
                    System.out.println();

                }
                sum = 0;
            }
        }
    }
}
