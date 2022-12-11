package Labs.L03Arrays;

import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        int[] numArr = new int[inputArr.length];
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < inputArr.length; i++) {
            numArr[i] = Integer.parseInt(inputArr[i]);
            if (numArr[i] % 2 == 0) {
                evenSum += numArr[i];
            } else {
                oddSum += numArr[i];
            }
        }
        int diff = evenSum - oddSum;
        System.out.println(diff);
    }
}
