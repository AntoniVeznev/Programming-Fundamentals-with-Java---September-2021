package Exams;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String concealedMessage = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            String[] stringArr = input.split(":\\|:");
            String command = stringArr[0];

            switch (command) {

                case "InsertSpace":
                    int index = Integer.parseInt(stringArr[1]);
                    String first = concealedMessage.substring(0, index);
                    String second = concealedMessage.substring(index);
                    concealedMessage = first + " " + second;
                    System.out.println(concealedMessage);
                    break;

                case "Reverse":
                    String substring = stringArr[1];
                    StringBuilder sb = new StringBuilder();

                    if (concealedMessage.contains(substring)) {
                        concealedMessage = concealedMessage.replace(substring, "");

                        for (int i = substring.length() - 1; i >= 0; i--) {
                            char symbol = substring.charAt(i);
                            sb.append(symbol);
                        }
                        concealedMessage = concealedMessage + sb;
                        System.out.println(concealedMessage);
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "ChangeAll":
                    String substringNew = stringArr[1];
                    String replacement = stringArr[2];

                    if (concealedMessage.contains(substringNew)) {
                        concealedMessage = concealedMessage.replaceAll(substringNew, replacement);
                    }
                    System.out.println(concealedMessage);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s%n", concealedMessage);
    }
}
