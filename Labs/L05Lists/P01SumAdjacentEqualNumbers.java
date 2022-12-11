package Labs.L05Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numList.size() - 1; i++) {

            if (numList.get(i).equals(numList.get(i + 1))) {

                numList.set(i, numList.get(i) + numList.get(i + 1));
                numList.remove(numList.get(i + 1));
                i = -1;

            }
        }

        for (Double item : numList) {
            DecimalFormat decimalFormat = new DecimalFormat("0.########");
            String formatItems = decimalFormat.format(item);
            System.out.print(formatItems + " ");

        }
    }
}
