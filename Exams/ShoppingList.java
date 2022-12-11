package Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")) {
            List<String> commandList = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String firstWord = commandList.get(0);
            if (firstWord.equals("Urgent")) {
                String item = commandList.get(1);
                if (shoppingList.contains(item)) {
                } else if (!shoppingList.contains(item)) {
                    shoppingList.add(0, item);
                }
            } else if (firstWord.equals("Unnecessary")) {
                String item = commandList.get(1);
                if (shoppingList.contains(item)) {
                    shoppingList.remove(String.valueOf(item));
                }
            } else if (firstWord.equals("Correct")) {
                String oldItem = commandList.get(1);
                String newItem = commandList.get(2);
                if (shoppingList.contains(oldItem)) {
                    for (int i = 0; i < shoppingList.size(); i++) {
                        if (shoppingList.get(i).equals(oldItem)) {
                            shoppingList.set(i, newItem);
                        }
                    }
                }
            } else if (firstWord.equals("Rearrange")) {
                String item = commandList.get(1);
                if (shoppingList.contains(item)) {
                    for (int i = 0; i < shoppingList.size(); i++) {
                        if (shoppingList.get(i).equals(item)) {
                            shoppingList.remove(shoppingList.get(i));
                            shoppingList.add(item);
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(shoppingList.toString()
                .replace("[", "")
                .replace("]", "")
                .trim()
                .replaceAll("\\s+", " "));
    }
}
