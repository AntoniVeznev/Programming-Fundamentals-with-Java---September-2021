package Exercises.E06ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P06OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String personalInformation = scanner.nextLine();
        List<PERSON> listOfPeople = new ArrayList<>();
        while (!personalInformation.equals("End")) {

            String name = personalInformation.split(" ")[0];
            String id = personalInformation.split(" ")[1];
            int age = Integer.parseInt(personalInformation.split(" ")[2]);

            PERSON person = new PERSON(name, id, age);
            listOfPeople.add(person);

            personalInformation = scanner.nextLine();
        }


        listOfPeople.sort(Comparator.comparing(PERSON::getAge));

        for (PERSON person : listOfPeople) {
            System.out.println(person.toString());
        }

    }
}

class PERSON {

    private String name;
    private String id;
    private int age;


    public PERSON(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }


    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {

        return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
    }
}