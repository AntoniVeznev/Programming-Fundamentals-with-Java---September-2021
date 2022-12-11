package Exams;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String massage = scanner.nextLine();
        String instructions = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        while (!instructions.equals("Decode")) {
            String[] instructionsArr = instructions.split("\\|");
            String firstInstruction = instructionsArr[0];

            switch (firstInstruction) {
                case "Move":
                    int number = Integer.parseInt(instructionsArr[1]);
                    String firstPart = massage.substring(0, number);
                    String lastPart = massage.substring(number);
                    massage = lastPart + firstPart;
                    break;
                case "Insert":
                    int index = Integer.parseInt(instructionsArr[1]);
                    String value = instructionsArr[2];
                    String begin = massage.substring(0, index);
                    String end = massage.substring(index);
                    massage = begin + value + end;

                    break;
                case "ChangeAll":
                    String substring = instructionsArr[1];
                    String replacement = instructionsArr[2];
                    if (massage.contains(substring)) {
                        for (int i = 0; i < massage.length(); i++) {
                            char symbol = massage.charAt(i);
                            String sym = symbol + "";
                            if (sym.equals(substring)) {
                                massage = massage.replace(sym, replacement);
                            }
                        }
                    }


                    break;
            }


            instructions = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", massage);
    }
}
