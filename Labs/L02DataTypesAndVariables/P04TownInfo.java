package Labs.L02DataTypesAndVariables;

import java.util.Scanner;

public class P04TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String townName = scanner.nextLine();
        int peopleCount = Integer.parseInt(scanner.nextLine());
        int areaInKm = Integer.parseInt(scanner.nextLine());
        System.out.printf("Town %s has population of %d and area %d square km.", townName, peopleCount, areaInKm);
    }
}
