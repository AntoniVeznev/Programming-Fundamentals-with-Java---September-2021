package Exercises.E05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean firstPlayerWins = false;
        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (firstDeck.size() != 0 && secondDeck.size() != 0) {
            int currentCardPlayer1 = firstDeck.get(0);
            int currentCardPlayer2 = secondDeck.get(0);
            if (currentCardPlayer1 > currentCardPlayer2) {
                firstDeck.add(currentCardPlayer1);
                firstDeck.add(currentCardPlayer2);
                firstDeck.remove(firstDeck.get(0));
                secondDeck.remove(secondDeck.get(0));
            } else if (currentCardPlayer2 > currentCardPlayer1) {
                secondDeck.add(currentCardPlayer2);
                secondDeck.add(currentCardPlayer1);
                firstDeck.remove(firstDeck.get(0));
                secondDeck.remove(secondDeck.get(0));
            } else {
                firstDeck.remove(firstDeck.get(0));
                secondDeck.remove(secondDeck.get(0));
            }
        }
        int sum = 0;
        if (firstDeck.size() == 0) {
            for (int i = 0; i < secondDeck.size(); i++) {
                sum += secondDeck.get(i);
            }
        } else if (secondDeck.size() == 0) {
            firstPlayerWins = true;
            for (int i = 0; i < firstDeck.size(); i++) {
                sum += firstDeck.get(i);
            }
        }
        if (firstPlayerWins) {
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
