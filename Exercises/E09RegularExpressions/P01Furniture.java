package Exercises.E09RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> productsNameList = new ArrayList<>();
        String regex = ">>(?<furniture>\\w+)<<(?<price>\\d+.\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        double totalPrice = 0;

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String product = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                productsNameList.add(product);
                totalPrice += price * quantity;
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");

        for (String element : productsNameList) {
            System.out.println(element);
        }
        System.out.printf("Total money spend: %.2f%n", totalPrice);
    }
}
