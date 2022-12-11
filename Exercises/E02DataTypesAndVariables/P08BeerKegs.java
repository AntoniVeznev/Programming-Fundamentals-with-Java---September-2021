package Exercises.E02DataTypesAndVariables;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBeers = Integer.parseInt(scanner.nextLine());
        double biggestKeg = Double.MIN_VALUE;
        String biggestModelOfKeg = "";
        for (int i = 1; i <= numberOfBeers; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * (Math.pow(radius, 2)) * height;
            if (volume > biggestKeg) {
                biggestKeg = volume;
                biggestModelOfKeg = model;
            }
        }
        System.out.println(biggestModelOfKeg);
    }
}
