package Exercises.E07MapsLambdaAndStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class P05Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        Map<String, List<String>> courseNameAndStudentName = new LinkedHashMap<>();

        while (!input.equals("end")) {
            List<String> commandList = Arrays.stream(input.split(":")).collect(Collectors.toList());
            String courseName = commandList.get(0);
            String studentName = commandList.get(1);

            if (!courseNameAndStudentName.containsKey(courseName)) {
                courseNameAndStudentName.put(courseName, new ArrayList<>());
            }
            courseNameAndStudentName.get(courseName).add(studentName);


            input = scanner.nextLine();
        }
        courseNameAndStudentName.entrySet().stream().sorted((e1, e2) ->
                Integer.compare(e2.getValue().size(), e1.getValue().size())).forEach(e -> {
            System.out.println(e.getKey() + ": " + e.getValue().size());
            e.getValue().stream().sorted(String::compareTo)
                    .forEach(student -> System.out.println("--" + student));
        });
    }
}
