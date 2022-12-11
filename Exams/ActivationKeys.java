package Exams;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String activationKey = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Generate")) {
            String[] commandArr = command.split(">>>");
            String mainCommand = commandArr[0];

            switch (mainCommand) {

                case "Contains":
                    String substring = commandArr[1];

                    if (activationKey.contains(substring)) {
                        System.out.printf("%s contains %s%n", activationKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String whatCaseIsThat = commandArr[1];
                    int startIndex = Integer.parseInt(commandArr[2]);
                    int endIndex = Integer.parseInt(commandArr[3]);

                    if (whatCaseIsThat.equals("Upper")) {
                        String replacement = activationKey.substring(startIndex, endIndex).toUpperCase();
                        activationKey = activationKey.replace(activationKey.substring(startIndex, endIndex), replacement);

                    } else if (whatCaseIsThat.equals("Lower")) {
                        String replacement = activationKey.substring(startIndex, endIndex).toLowerCase();
                        activationKey = activationKey.replace(activationKey.substring(startIndex, endIndex), replacement);
                    }
                    System.out.println(activationKey);
                    break;

                case "Slice":
                    int start = Integer.parseInt(commandArr[1]);
                    int end = Integer.parseInt(commandArr[2]);
                    String delete = activationKey.substring(start, end);
                    activationKey = activationKey.replace(delete, "");
                    System.out.println(activationKey);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + activationKey);
    }
}
