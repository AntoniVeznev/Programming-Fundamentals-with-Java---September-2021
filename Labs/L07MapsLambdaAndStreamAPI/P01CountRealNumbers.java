package Labs.L07MapsLambdaAndStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Double> numbersList = Arrays.stream(input.split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        Map<Double, Integer> dataMap = new TreeMap<>();

        for (int i = 0; i < numbersList.size(); i++) {
            double currentNumber = numbersList.get(i);

            if (!dataMap.containsKey(currentNumber)) {
                dataMap.put(currentNumber, 1);

            } else {
                int currentValue = dataMap.get(currentNumber);
                dataMap.put(currentNumber, currentValue + 1);
            }
        }
        for (Map.Entry<Double, Integer> element : dataMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", element.getKey(), element.getValue());
        }
    }
}
