package variables;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.printf("Wprowadz imie:");
        String name = scanner.nextLine();
        System.out.printf("Wprowadz nazwisko:");
        String lastName = scanner.nextLine();
        System.out.printf("Wprowadz plec:");
        char gender = scanner.nextLine().charAt(0);
        System.out.printf("Wprowadz pensje:");
        double salary_net = scanner.nextDouble();



    }
}
