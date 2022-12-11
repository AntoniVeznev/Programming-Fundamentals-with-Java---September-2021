package Labs.L06ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {
    static class Student {
        String firstName;
        String lastName;
        String age;
        String hometown;

        public Student(String firstName, String lastName, String age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getHometown() {
            return this.hometown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] dataArr = input.split(" ");
            String firstName = dataArr[0];
            String lastName = dataArr[1];
            String age = dataArr[2];
            String hometown = dataArr[3];
            Student student = new Student(firstName, lastName, age, hometown);
            studentsList.add(student);
            input = scanner.nextLine();
        }
        String searchTown = scanner.nextLine();
        for (Student s : studentsList) {
            if (s.getHometown().equals(searchTown)) {
                System.out.printf("%s %s is %s years old%n", s.getFirstName(), s.getLastName(), s.getAge());
            }
        }
    }
}
