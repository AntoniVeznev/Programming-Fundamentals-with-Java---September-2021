package Exercises.E05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> passengersInEachWagonList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacityInEachWagon = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            List<String> commandInput = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String miniCommand = commandInput.get(0);
            if (miniCommand.equals("Add")) {
                int number = Integer.parseInt(commandInput.get(1));
                passengersInEachWagonList.add(number);
            } else {
                int hora = Integer.parseInt(commandInput.get(0));
                for (int i = 0; i < passengersInEachWagonList.size(); i++) {
                    int sum = 0;
                    int currentNumber = passengersInEachWagonList.get(i);
                    if (currentNumber + hora <= maxCapacityInEachWagon) {
                        sum = currentNumber + hora;
                        passengersInEachWagonList.set(i, sum);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (Integer finalList : passengersInEachWagonList) {
            System.out.print(finalList + " ");
        }
    }
}
