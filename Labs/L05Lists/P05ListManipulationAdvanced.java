package Labs.L05Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commandLine.get(0);
            switch (command) {
                case "Contains":
                    int numContains = Integer.parseInt(commandLine.get(1));
                    if (numberList.contains(numContains)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String lastWord = commandLine.get(1);
                    if (lastWord.equals("even")) {
                        List<Integer> evenNumbersList = new ArrayList<>();
                        for (int i = 0; i < numberList.size(); i++) {
                            if (numberList.get(i) % 2 == 0) {
                                evenNumbersList.add(numberList.get(i));
                            }
                        }
                        System.out.println(evenNumbersList.toString().replaceAll("[\\[\\],]", ""));
                    } else if (lastWord.equals("odd")) {
                        List<Integer> oddNumbersList = new ArrayList<>();
                        for (int i = 0; i < numberList.size(); i++) {
                            if (numberList.get(i) % 2 != 0) {
                                oddNumbersList.add(numberList.get(i));
                            }
                        }
                        System.out.println(oddNumbersList.toString().replaceAll("[\\[\\],]", ""));
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numberList.size(); i++) {
                        int currentNumber = numberList.get(i);
                        sum += currentNumber;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = commandLine.get(1);
                    int number = Integer.parseInt(commandLine.get(2));
                    List<Integer> newList = new ArrayList<>();
                    for (int i = 0; i < numberList.size(); i++) {
                        int currentNumber = numberList.get(i);
                        if (condition.equals("<")) {
                            if (currentNumber < number) {
                                newList.add(currentNumber);
                            }
                        } else if (condition.equals(">")) {
                            if (currentNumber > number) {
                                newList.add(currentNumber);
                            }
                        } else if (condition.equals(">=")) {
                            if (currentNumber >= number) {
                                newList.add(currentNumber);
                            }
                        } else if (condition.equals("<=")) {
                            if (currentNumber <= number) {
                                newList.add(currentNumber);
                            }
                        }
                    }
                    System.out.println(newList.toString().replaceAll("[\\[\\],]", ""));
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
