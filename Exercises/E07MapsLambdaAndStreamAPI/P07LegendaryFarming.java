package Exercises.E07MapsLambdaAndStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class P07LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> keyMaterialMap = new TreeMap<>();
        keyMaterialMap.put("shards", 0);
        keyMaterialMap.put("fragments", 0);
        keyMaterialMap.put("motes", 0);
        Map<String, Integer> junkMap = new TreeMap<>();
        boolean isBought = false;
        while (!isBought) {
            List<String> inputList = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
            for (int i = 0; i < inputList.size(); i += 2) {
                int quantity = Integer.parseInt(inputList.get(i));
                String material = inputList.get(i + 1).toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    if (!keyMaterialMap.containsKey(material)) {
                        keyMaterialMap.put(material, quantity);
                    } else {
                        int current = keyMaterialMap.get(material);
                        keyMaterialMap.put(material, current + quantity);
                    }
                    if (keyMaterialMap.containsKey("shards")) {
                        int currentQuantity = keyMaterialMap.get("shards");
                        if (currentQuantity >= 250) {
                            System.out.println("Shadowmourne obtained!");
                            isBought = true;
                            currentQuantity = currentQuantity - 250;
                            keyMaterialMap.put("shards", currentQuantity);
                        }
                    }
                    if (keyMaterialMap.containsKey("fragments")) {
                        int currentQuantity = keyMaterialMap.get("fragments");
                        if (currentQuantity >= 250) {
                            System.out.println("Valanyr obtained!");
                            isBought = true;
                            currentQuantity = currentQuantity - 250;
                            keyMaterialMap.put("fragments", currentQuantity);
                        }
                    }
                    if (keyMaterialMap.containsKey("motes")) {
                        int currentQuantity = keyMaterialMap.get("motes");
                        if (currentQuantity >= 250) {
                            System.out.println("Dragonwrath obtained!");
                            isBought = true;
                            currentQuantity = currentQuantity - 250;
                            keyMaterialMap.put("motes", currentQuantity);
                        }
                    }
                } else {
                    if (!junkMap.containsKey(material)) {
                        junkMap.put(material, quantity);
                    } else {
                        int currentQuantity = junkMap.get(material);
                        junkMap.put(material, currentQuantity + quantity);
                    }
                }
                if (isBought) {
                    break;
                }
            }
            if (isBought) {
                break;
            }
            input = scanner.nextLine();
        }
        keyMaterialMap.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junkMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
