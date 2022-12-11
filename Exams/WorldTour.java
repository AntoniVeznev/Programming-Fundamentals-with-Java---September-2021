package Exams;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Travel")) {
            String[] commandArr = command.split(":");
            String firstCommand = commandArr[0];

            switch (firstCommand) {
                case "Add Stop":
                    int index = Integer.parseInt(commandArr[1]);
                    String string = commandArr[2];

                    if (index <= input.length() && index >= 0) {
                        String firstPart = input.substring(0, index);
                        String secondPart = input.substring(index);
                        input = firstPart + string + secondPart;
                        System.out.println(input);
                    } else {
                        System.out.println(input);
                    }

                    break;

                case "Remove Stop":
                    int startIndex = Integer.parseInt(commandArr[1]);
                    int endIndex = Integer.parseInt(commandArr[2]);

                    if (input.length() > startIndex && startIndex >= 0 && endIndex <= input.length() && endIndex > 0) {
                        String firstPart = input.substring(0, startIndex);
                        String endPart = input.substring(endIndex + 1);
                        input = firstPart + endPart;
                        System.out.println(input);
                    } else {
                        System.out.println(input);
                    }
                    break;

                case "Switch":
                    String oldString = commandArr[1];
                    String newString = commandArr[2];

                    if (input.contains(oldString)) {
                        input = input.replaceAll(oldString, newString);
                        System.out.println(input);
                    } else {
                        System.out.println(input);
                    }


                    break;

            }
            command = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s%n", input);
    }
}
