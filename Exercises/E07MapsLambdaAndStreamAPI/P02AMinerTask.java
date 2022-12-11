package Exercises.E07MapsLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> quantityMap = new LinkedHashMap<>();

        String resource = scanner.nextLine();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!quantityMap.containsKey(resource)) {
                quantityMap.put(resource, quantity);
            } else {
                int current = quantityMap.get(resource);
                quantityMap.put(resource, current + quantity);
            }


            resource = scanner.nextLine();
        }

        quantityMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}
