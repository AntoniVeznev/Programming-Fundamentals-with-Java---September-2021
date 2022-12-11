package Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elementList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        String count = "";
        int countWins = 0;

        while (!input.equals("end")) {

            count = elementList.get(0);
            List<Integer> indexList = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            int firstIndex = indexList.get(0);
            int secondIndex = indexList.get(1);

            if (firstIndex == secondIndex || firstIndex < 0 || firstIndex > elementList.size() - 1
                    || secondIndex < 0 || secondIndex > elementList.size() - 1) {
                elementList.add(elementList.size() / 2, "-" + count + "a");
                elementList.add(elementList.size() / 2, "-" + count + "a");
                System.out.println("Invalid input! Adding additional elements to the board");
                input = scanner.nextLine();
                continue;
            }

            if (elementList.get(firstIndex).equals(elementList.get(secondIndex))) {
                String element = elementList.get(firstIndex);
                String first = elementList.get(firstIndex);
                String second = elementList.get(secondIndex);
                elementList.remove(first);
                elementList.remove(second);
                System.out.printf("Congrats! You have found matching elements - %s!%n", element);
                countWins++;

            } else if (!elementList.get(firstIndex).equals(elementList.get(secondIndex))) {
                System.out.println("Try again!");
            }
            if (elementList.size() == 0) {
                System.out.printf("You have won in %d turns!", countWins);
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("end") && elementList.size() >= 2) {
            System.out.println("Sorry you lose :(");
            for (String finalList : elementList) {
                System.out.print(finalList + " ");
            }
        }
    }
}
