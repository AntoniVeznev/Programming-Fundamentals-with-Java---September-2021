package Exercises.E05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            List<String> listCommand = Arrays.stream(command.split(" ")).collect(Collectors.toList());

            String currentCommand = listCommand.get(0);

            if (currentCommand.equals("Delete")) {
                int currentIndex = Integer.parseInt(listCommand.get(1));

                for (int i = 0; i < numList.size(); i++) {

                    if (currentIndex == numList.get(i)) {
                        numList.remove(numList.get(i));

                    }
                }

            } else if (currentCommand.equals("Insert")) {

                int currentElement = Integer.parseInt(listCommand.get(1));
                int currentIndex = Integer.parseInt(listCommand.get(2));

                numList.add(currentIndex, currentElement);
            }
            command = scanner.nextLine();
        }
        for (Integer finalList : numList) {
            System.out.print(finalList + " ");
        }
    }

}
