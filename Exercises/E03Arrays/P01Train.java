package Exercises.E03Arrays;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countWagons = Integer.parseInt(scanner.nextLine());
        int[] peopleArr = new int[countWagons];
        int sum = 0;
        for (int i = 0; i < peopleArr.length; i++) {
            peopleArr[i] = Integer.parseInt(scanner.nextLine());
            sum += peopleArr[i];
            System.out.print(peopleArr[i] + " ");
        }
        System.out.println();
        System.out.print(sum);
    }
}
