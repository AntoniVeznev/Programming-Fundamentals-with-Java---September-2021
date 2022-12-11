package Exercises.E07MapsLambdaAndStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class P03Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Double> priceProducts = new LinkedHashMap<>();
        Map<String, Integer> quantityProducts = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            List<String> inputList = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String names = inputList.get(0);
            double prices = Double.parseDouble(inputList.get(1));
            int quantities = Integer.parseInt(inputList.get(2));
            priceProducts.put(names, prices);

            if (!quantityProducts.containsKey(names)) {
                quantityProducts.put(names, quantities);

            } else {
                int currentQuantity = quantityProducts.get(names);
                quantityProducts.put(names, currentQuantity + quantities);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : priceProducts.entrySet()) {
            String productName = entry.getKey();
            double finalSum = entry.getValue() * quantityProducts.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }
}
