package Labs.L05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            List<String> listInput = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            String command = listInput.get(0);

            switch (command) {

                case "Add":
                    int numberToAdd = Integer.parseInt(listInput.get(1));
                    numList.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(listInput.get(1));
                    numList.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int numberToRemoveAt = Integer.parseInt(listInput.get(1));
                    numList.remove(numberToRemoveAt);
                    break;
                case "Insert":
                    int numberToNumber = Integer.parseInt(listInput.get(1));
                    int numberToIndex = Integer.parseInt(listInput.get(2));
                    numList.add(numberToIndex, numberToNumber);
                    break;

            }

            input = scanner.nextLine();

        }

        for (Integer item : numList) {
            System.out.print(item + " ");

        }
    }
}
