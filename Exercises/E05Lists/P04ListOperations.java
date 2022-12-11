package Exercises.E05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String operations = scanner.nextLine();

        while (!operations.equals("End")) {

            List<String> stringList = Arrays.stream(operations.split(" ")).collect(Collectors.toList());
            String word = stringList.get(0);

            if (word.equals("Add")) {
                int number = Integer.parseInt(stringList.get(1));
                numberList.add(number);
            } else if (word.equals("Insert")) {

                int number = Integer.parseInt(stringList.get(1));
                int index = Integer.parseInt(stringList.get(2));
                if (index < 0 || index > numberList.size() - 1) {

                    System.out.println("Invalid index");
                } else {
                    numberList.add(index, number);
                }
            } else if (word.equals("Remove")) {

                int index = Integer.parseInt(stringList.get(1));
                if (index < 0 || index > numberList.size() - 1) {

                    System.out.println("Invalid index");
                } else {
                    numberList.remove(index);
                }
            } else if (word.equals("Shift")) {

                String secondWord = stringList.get(1);
                if (secondWord.equals("left")) {

                    int count = Integer.parseInt(stringList.get(2));
                    for (int i = 0; i < count; i++) {

                        int firstNumber = numberList.get(0);
                        numberList.add(firstNumber);
                        numberList.remove(0);
                    }
                } else if (secondWord.equals("right")) {

                    int count = Integer.parseInt(stringList.get(2));
                    for (int i = 0; i < count; i++) {

                        int lastNumber = numberList.get(numberList.size() - 1);
                        numberList.add(0, lastNumber);
                        numberList.remove(numberList.size() - 1);
                    }
                }
            }
            operations = scanner.nextLine();
        }
        for (Integer finalList : numberList) {

            System.out.print(finalList + " ");
        }
    }
}
