package Exercises.E01BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int finishNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = startNumber; i <= finishNumber; i++) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
