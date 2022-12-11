package Exercises.E07MapsLambdaAndStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class P04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        Map<String, String> usernamePlusCarNumber = new HashMap<>();
        List<String> names = new ArrayList<>();
        for (int i = 1; i <= numberOfCommands; i++) {
            String command = scanner.nextLine();
            List<String> commandList = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String currentCommands = commandList.get(0);
            switch (currentCommands) {
                case "register":
                    if (commandList.get(0).equals("register")) {
                        String currentUsername = commandList.get(1);
                        String currentRegistrationNumber = commandList.get(2);
                        if (!usernamePlusCarNumber.containsKey(currentUsername)) {
                            usernamePlusCarNumber.put(currentUsername, currentRegistrationNumber);
                            names.add(currentUsername);
                            System.out.printf("%s registered %s successfully%n", currentUsername,
                                    currentRegistrationNumber);
                        } else {
                            System.out.printf("ERROR: already registered with plate number %s%n", currentRegistrationNumber);
                        }
                    }
                    break;
                case "unregister":
                    if (commandList.get(0).equals("unregister")) {
                        String currentUsername = commandList.get(1);
                        if (!usernamePlusCarNumber.containsKey(currentUsername)) {
                            System.out.printf("ERROR: user %s not found%n", currentUsername);
                        } else {
                            names.remove(currentUsername);
                            System.out.printf("%s unregistered successfully%n", currentUsername);
                        }
                    }
                    break;
            }
        }
        for (String items : names) {
            System.out.printf("%s => %s%n", items, usernamePlusCarNumber.get(items));
        }
    }
}
