package Labs.L06ObjectsAndClasses;

import java.math.BigDecimal;
import java.util.Scanner;

public class P02SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal firstNumber = new BigDecimal(scanner.nextLine());
        BigDecimal secondNumber = new BigDecimal(scanner.nextLine());

        BigDecimal result = firstNumber.add(secondNumber);

        System.out.println(result);

    }
}
