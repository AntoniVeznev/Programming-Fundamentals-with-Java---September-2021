package Labs.L05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < integerList.size() - 1; i++) {

            int sum = 0;
            sum = integerList.get(i) + integerList.get(integerList.size() - 1);
            integerList.set(i, sum);
            integerList.remove(integerList.size() - 1);

        }

        for (int item : integerList) {
            System.out.print(item + " ");

        }
    }
}
