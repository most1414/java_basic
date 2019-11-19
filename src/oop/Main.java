package oop;

import java.util.Scanner;

// klasa glowna - uruchomieniowa
public class Main {
    public static void main(String[] args) {
        // utworzenie obiektu
        User userOne = new User();
        // odwolanie do pola klasowego
        userOne.name = "Michal";
        userOne.lastName = "Ostrowski";
        userOne.activated = true;
        userOne.salary_net = 5555;
        userOne.gender = 'M';
        // wywolanie metody
        userOne.printUser();

        User userTwo = new User("Adam","Kowalski",'M', false, 4000);
        userTwo.printUser();

        User userThree = new User("Anna","Nowak",'K', true, 8000);
        userThree.printUser();
        double salaryGross = userOne.calculateSalaryGross();
        System.out.println("salaryGross =" + salaryGross);
        System.out.println("Calculated salary gross: "+ userTwo.calculateSalaryGross());
        System.out.println("==============");
        System.out.println(userThree.modifyUserParameters(15000, true));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz imie:");
        String name = scanner.nextLine();
        System.out.println("Wprowadz nazwisko:");
        String lastName = scanner.nextLine();
        System.out.println("Wprowadz plec:");
        char gender = scanner.nextLine().charAt(0);
        System.out.println("Wprowadz pensje:");
        double salary_net = scanner.nextDouble();
        User userFour = new User(name, lastName, gender, true, salary_net);
        userFour.printUser();

    }
}
