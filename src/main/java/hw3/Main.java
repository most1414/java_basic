package hw3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company c = new Company();
        System.out.println("Info: "+c.addEmployee("Adam", "Kowalski", "76061593021", LocalDate.of(1976, 6, 15), 10000));
        System.out.println("Info: "+c.addEmployee("Jan", "Banach", "760615930221", LocalDate.of(1989, 6, 15), 15000));
        System.out.println("Info: "+c.addEmployee("Jacek", "Ostrowki", "99061593021", LocalDate.of(1999, 6, 15), 20000));
        System.out.println("Znaleziono: " + c.getEmployeeByPESEL("76061593021"));
        c.getEmployees();
        System.out.println("Zmiana pensji: "+ c.setSalaryByPESEL(2000,"99061593021"));
        System.out.println("Zmiana pensji: "+ c.setSalaryByPESEL(5000,"76061593021"));
        c.getEmployees();

    }

}
