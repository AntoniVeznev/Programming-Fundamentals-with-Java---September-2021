package Exercises.E06ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P04Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> listOfStudents = new ArrayList<>();
        int countStudents = Integer.parseInt(scanner.nextLine());
        for (int student = 1; student <= countStudents; student++) {
            String studentInfo = scanner.nextLine();

            String firstName = studentInfo.split(" ")[0];
            String secondName = studentInfo.split(" ")[1];
            double grade = Double.parseDouble(studentInfo.split(" ")[2]);

            Student studentObj = new Student(firstName, secondName, grade);
            listOfStudents.add(studentObj);
        }


        listOfStudents.sort(Comparator.comparing(Student::getGrade).reversed());


        for (Student student : listOfStudents) {
            System.out.println(student);
        }
    }
}


class Student {

    private String firstName;
    private String secondName;
    private double grade;


    public Student(String firstName, String secondName, double grade) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }


    public double getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {

        return String.format("%s %s: %.2f", this.firstName, this.secondName, this.grade);
    }
}



