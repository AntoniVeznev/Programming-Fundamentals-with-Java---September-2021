package Exercises.E01BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        int headsetCounter = 0;
        int mouseCounter = 0;
        int keyboardCounter = 0;
        int counterKeyboard = 0;
        int displayCounter = 0;
        double totalSum = 0;

        for (int i = 1; i <= lostGames; i++) {
            int counter1 = 0;
            int counter2 = 0;
            if (i % 2 == 0) {
                headsetCounter++;
                counter1++;
            }
            if (i % 3 == 0) {
                mouseCounter++;
                counter2++;
            }
            if (counter1 == 1 && counter2 == 1) {
                keyboardCounter++;
                counterKeyboard++;
            }
            if (keyboardCounter % 2 == 0 && keyboardCounter != 0) {
                displayCounter++;
                keyboardCounter = 0;
            }
        }
        totalSum = (headsetCounter * headsetPrice) + (mouseCounter * mousePrice) + (counterKeyboard * keyboardPrice) + (displayCounter * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", totalSum);
    }
}
