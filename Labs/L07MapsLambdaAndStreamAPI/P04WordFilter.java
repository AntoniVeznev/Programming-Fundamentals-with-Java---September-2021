package Labs.L07MapsLambdaAndStreamAPI;

import java.util.Scanner;

public class P04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] fruitsArr = input.split("\\s+");

        for (int i = 0; i < fruitsArr.length; i++) {
            String currentFruit = fruitsArr[i];

            if (currentFruit.length() % 2 == 0) {
                System.out.println(currentFruit);
            }
        }
    }
}
