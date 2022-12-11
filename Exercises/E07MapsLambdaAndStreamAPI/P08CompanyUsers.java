package Exercises.E07MapsLambdaAndStreamAPI;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> nameId = new TreeMap<>();

        while (!input.equals("End")) {
            String[] commandArr = input.split(" -> ");

            String name = commandArr[0];
            String id = commandArr[1];

            if (!nameId.containsKey(name)) {
                nameId.put(name, new ArrayList<>());
                nameId.get(name).add(id);

            } else {
                if (!nameId.get(name).contains(id))
                    nameId.get(name).add(id);
            }


            input = scanner.nextLine();
        }

        nameId.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(company -> {
                    System.out.println(company.getKey());
                    company.getValue().forEach(employee -> System.out.println("-- " + employee));

                });
    }
}
