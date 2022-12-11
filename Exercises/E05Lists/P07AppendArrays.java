package Exercises.E05Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listInput = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(listInput);
        System.out.println(listInput.toString()
                .replace("[", "")
                .replace("]", "")
                .trim()
                .replace(",", "")
                .replaceAll("\\s+", " "));
    }
}
