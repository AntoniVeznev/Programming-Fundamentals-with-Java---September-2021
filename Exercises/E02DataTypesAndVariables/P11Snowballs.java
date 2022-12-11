package Exercises.E02DataTypesAndVariables;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSnowBalls = Integer.parseInt(scanner.nextLine());
        double snowballValue = 0;
        double maxValue = Double.MIN_VALUE;
        int currentSnowBallSnow = 0;
        int currentSnowballTime = 0;
        int currentSnowballQuality = 0;
        for (int i = 1; i <= numberOfSnowBalls; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            snowballValue = Math.pow((1.0 * snowballSnow / snowballTime), snowballQuality);
            if (snowballValue > maxValue) {
                maxValue = snowballValue;
                currentSnowBallSnow = snowballSnow;
                currentSnowballTime = snowballTime;
                currentSnowballQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", currentSnowBallSnow, currentSnowballTime, maxValue, currentSnowballQuality);
    }
}
