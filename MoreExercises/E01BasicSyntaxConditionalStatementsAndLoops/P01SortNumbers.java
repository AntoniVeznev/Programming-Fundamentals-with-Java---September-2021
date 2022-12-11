package MoreExercises.E01BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int middleNumber = Integer.MIN_VALUE;
        if (n1 > n2 && n1 > n3) {
            maxValue = n1;
            if (n2 > n3) {
                minValue = n3;
                middleNumber = n2;
            } else {
                minValue = n2;
                middleNumber = n3;
            }
        } else if (n2 > n1 && n2 > n3) {
            maxValue = n2;
            if (n1 > n3) {
                minValue = n3;
                middleNumber = n1;
            } else {
                minValue = n1;
                middleNumber = n3;
            }
        } else if (n3 > n1 && n3 > n2) {
            maxValue = n3;
            if (n2 > n1) {
                minValue = n1;
                middleNumber = n2;
            } else {
                minValue = n2;
                middleNumber = n1;
            }
        }
        System.out.println(maxValue);
        System.out.println(middleNumber);
        System.out.println(minValue);
    }
}
