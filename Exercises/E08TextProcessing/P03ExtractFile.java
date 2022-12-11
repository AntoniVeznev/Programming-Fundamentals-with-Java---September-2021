package Exercises.E08TextProcessing;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] pathArr = input.split("\\\\");

        String lastCommand = pathArr[pathArr.length - 1];

        String[] splitArr = lastCommand.split("\\.");

        String firstWord = splitArr[0];

        String secondSecond = splitArr[1];

        System.out.printf("File name: %s%n", firstWord);
        System.out.printf("File extension: %s", secondSecond);

    }
}
