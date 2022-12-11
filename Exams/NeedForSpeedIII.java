package Exams;

import java.util.*;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCars = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> carDetails = new TreeMap<>();
        for (int i = 0; i < numberOfCars; i++) {
            String[] inputArr = scanner.nextLine().split("\\|");
            String car = inputArr[0];
            int mileage = Integer.parseInt(inputArr[1]);
            int fuel = Integer.parseInt(inputArr[2]);
            carDetails.put(car, new ArrayList<>());
            carDetails.get(car).add(mileage);
            carDetails.get(car).add(fuel);
        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] commandsArr = input.split(" : ");
            String command = commandsArr[0];
            switch (command) {
                case "Drive":
                    String car = commandsArr[1];
                    int distance = Integer.parseInt(commandsArr[2]);
                    int fuel = Integer.parseInt(commandsArr[3]);
                    int currentFuelInTheCar = carDetails.get(car).get(1);
                    if (fuel > currentFuelInTheCar) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        int currentMileage = carDetails.get(car).get(0);
                        int newMileage = currentMileage + distance;
                        carDetails.get(car).remove(0);
                        carDetails.get(car).add(newMileage);
                        int currentFuelInCar = carDetails.get(car).get(0);
                        int newFuel = currentFuelInCar - fuel;
                        carDetails.get(car).remove(0);
                        carDetails.get(car).add(newFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                        if (carDetails.get(car).get(0) >= 100000) {
                            carDetails.remove(car, carDetails.get(car));
                            System.out.printf("Time to sell the %s!%n", car);
                        }
                    }
                    break;
                case "Refuel":
                    String inputCar = commandsArr[1];
                    int inputFuel = Integer.parseInt(commandsArr[2]);
                    int currentFuel = carDetails.get(inputCar).get(1);
                    if (currentFuel + inputFuel > 75) {
                        carDetails.get(inputCar).remove(1);
                        carDetails.get(inputCar).add(75);
                        int diff = 75 - currentFuel;
                        System.out.printf("%s refueled with %d liters%n", inputCar, diff);
                    } else if (currentFuel + inputFuel < 75) {
                        int diff = currentFuel + inputFuel;
                        carDetails.get(inputCar).remove(1);
                        carDetails.get(inputCar).add(diff);
                        System.out.printf("%s refueled with %d liters%n", inputCar, inputFuel);
                    }
                    break;
                case "Revert":
                    String carCar = commandsArr[1];
                    int kilometres = Integer.parseInt(commandsArr[2]);
                    int currentMileage = carDetails.get(carCar).get(0);
                    int diff = currentMileage - kilometres;
                    carDetails.get(carCar).set(0, diff);
                    if (diff < 10000) {
                        carDetails.get(carCar).set(0, 10000);
                    } else {
                        System.out.printf("%s mileage decreased by %d kilometers%n", carCar, kilometres);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        carDetails.entrySet().stream().sorted((e1, e2) -> {
            return e2.getValue().get(0).compareTo(e1.getValue().get(0));
        }).forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}
