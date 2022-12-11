package Exercises.E03Arrays;

import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int rotationNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotationNumber; i++) {
            String first = array[0];

            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];

            }

            array[array.length - 1] = first;

        }

        for (String newRotation : array) {
            System.out.print(newRotation + " ");

        }
    }
}
