package Labs.L03Arrays;

import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numArr = new int[input.length];
        int eSum = 0;
        for (int i = 0; i < input.length; i++) {
            numArr[i] = Integer.parseInt(input[i]);
            int currentNumber = numArr[i];
            if (currentNumber % 2 == 0) {
                eSum += currentNumber;
            }
        }
        System.out.println(eSum);
    }
}
