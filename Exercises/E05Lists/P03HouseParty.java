package Exercises.E05Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        List<String> namesList = new ArrayList<>();

        for (int i = 0; i < numberOfCommands; i++) {

            String input = scanner.nextLine();

            List<String> stringList = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            String name = stringList.get(0);
            String differenceBetweenTwoCommands = stringList.get(2);

            if (differenceBetweenTwoCommands.equals("going!")) {

                if (namesList.contains(name)) {

                    System.out.printf("%s is already in the list!%n", name);
                } else {

                    namesList.add(name);
                }

            } else if (differenceBetweenTwoCommands.equals("not")) {

                if (namesList.contains(name)) {

                    namesList.remove(name);
                } else {

                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        for (String finalGuestList : namesList) {

            System.out.println(finalGuestList + " ");
        }

    }
}
