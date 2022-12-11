package Labs.L08TextProcessing;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String finalResult = "";

            for (int i = input.length() - 1; i >= 0; i--) {
                finalResult = finalResult + input.charAt(i);
            }
            System.out.printf("%s = %s%n", input, finalResult);
            input = scanner.nextLine();
        }
    }
}
