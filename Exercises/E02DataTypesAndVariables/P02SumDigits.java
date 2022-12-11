package Exercises.E02DataTypesAndVariables;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            sum += digit;
        }
        System.out.println(sum);
    }
}
