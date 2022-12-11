package Exercises.E01BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";
        String newUsername = scanner.nextLine();
        int counter = 0;
        for (int i = username.length() - 1; i >= 0; i--) {
            password = password + username.charAt(i);
        }
        while (!newUsername.equals(password)) {
            counter++;
            if (counter == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            newUsername = scanner.nextLine();
        }
        if (newUsername.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
