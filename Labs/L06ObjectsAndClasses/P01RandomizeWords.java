package Labs.L06ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] wordsArr = input.split(" ");

        Random random = new Random();

        for (int i = 0; i < wordsArr.length; i++) {

            int x = random.nextInt(wordsArr.length);
            int y = random.nextInt(wordsArr.length);

            String currentElement = wordsArr[x];
            wordsArr[x] = wordsArr[y];
            wordsArr[y] = currentElement;

        }
        for (String finalWordArr : wordsArr) {
            System.out.println(finalWordArr);
        }
    }
}
