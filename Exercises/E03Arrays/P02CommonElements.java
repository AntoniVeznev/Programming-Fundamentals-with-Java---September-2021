package Exercises.E03Arrays;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array1 = scanner.nextLine().split(" ");
        String[] array2 = scanner.nextLine().split(" ");
        for (int index2 = 0; index2 < array2.length; index2++) {
            String currentPosition = array2[index2];
            for (int index1 = 0; index1 < array1.length; index1++) {
                if (currentPosition.equals(array1[index1])) {
                    System.out.print(currentPosition + " ");
                }
            }
        }
    }
}
