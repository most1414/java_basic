package hw3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<>();

    // dodawanie pracownika do listy
    // walidacja numeru PESEL
    // -> lenght = 11
    // -> unique
    public String addEmployee(
            String name,
            String lastname,
            String PESEL,
            LocalDate birthDate,
            double salaryNet) {
        if (PESEL.length() == 11 && isPESELUnique(PESEL)) {
            Employee e = new Employee(
                    name, lastname, PESEL,
                    LocalDate.now(), birthDate, salaryNet
            );
            employees.add(e);
            return e.toString();
        } else if (isPESELUnique(PESEL)) {
            return "Istnieje taki PESEL w bazie danych";
        }else {
            return "BLEDNY PESEL";
        }
    }
    // metoda sprawdzajaca czy pesel wystepuje w bazie pracownikow
    public boolean isPESELUnique(String PESEL){
        for (Employee e : employees){
            // sprawdzanie wystepowania peselu
            if (e.getPESEL().equals(PESEL)){
                return false;
            }
        }
        return true;
    }
    // metoda wyszukujaca pracownika po numerze peel
    public Employee getEmployeeByPESEL(String PESEL){
        for (Employee e:employees){
            if (e.getPESEL().equals(PESEL)){
                return e;
            }
        }
        return  null;
    }
    //metoda wypisujaca wszystkich pracownikow
    public void getEmployees(){
        System.out.println("Lista pracownikow");
        for (Employee e:employees){
            System.out.println(e);
        }
    }
//zmiana pensji pracownikowi o okreslonym numerze PESEL
    public String setSalaryByPESEL(double salary, String PESEL){
        Employee employee = getEmployeeByPESEL(PESEL);
        if (employee != null){
        // sprawdzam na jakim indeksie w liscie jest pracownik
        int index = employees.indexOf(employee);
        employee.setSalaryNet(salary);
        // aktualizuje pracownika na tym samym indeksie
        employees.set(index, employee);
        return employee.toString();

        }
        return "Nie ma pracownika o takim numerze PESEL";
    }
}