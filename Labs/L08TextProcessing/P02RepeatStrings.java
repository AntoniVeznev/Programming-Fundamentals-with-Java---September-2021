package Labs.L08TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArr = scanner.nextLine().split(" ");
        List<String> finalResult = new ArrayList<>();

        for (int i = 0; i < stringArr.length; i++) {
            String currentText = stringArr[i];
            String finalText = "";

            for (int j = 0; j < currentText.length(); j++) {
                finalText += currentText;
            }
            finalResult.add(finalText);
        }
        for (String exitText : finalResult) {
            System.out.print(exitText);
        }
    }
}
