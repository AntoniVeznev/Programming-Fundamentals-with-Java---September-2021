package Exercises.E03Arrays;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArr = new String[n];
        String[] secondArr = new String[n];
        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split(" ");
            for (int j = 0; j < inputArr.length - 1; j++) {
                String firstSymbol = inputArr[0];
                String secondSymbol = inputArr[1];
                for (int k = 0; k < firstArr.length; k++) {
                    if ((i + 1) % 2 != 0) {
                        firstArr[k + i] = firstSymbol;
                        secondArr[k + i] = secondSymbol;
                        break;
                    } else {
                        secondArr[k + i] = firstSymbol;
                        firstArr[k + i] = secondSymbol;
                        break;
                    }
                }
            }
        }
        for (String array1 : firstArr) {
            System.out.print(array1 + " ");
        }
        System.out.println();
        for (String array2 : secondArr) {
            System.out.print(array2 + " ");
        }
    }
}
