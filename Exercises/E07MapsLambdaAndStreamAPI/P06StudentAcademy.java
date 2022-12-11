package Exercises.E07MapsLambdaAndStreamAPI;

import java.util.*;

public class P06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> dataMap = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!dataMap.containsKey(studentName)) {
                dataMap.put(studentName, new ArrayList<>());
            }
            dataMap.get(studentName).add(grade);
        }
        Map<String, Double> averageGrades = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : dataMap.entrySet()) {
            String name = entry.getKey();
            List<Double> grade = entry.getValue();
            double averageGrade = grade.stream().mapToDouble(Double::doubleValue).average().getAsDouble();

            if (averageGrade >= 4.50) {
                averageGrades.put(name, averageGrade);
            }
        }
        averageGrades.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
}
