package hw3;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
@Data // automatycznie korzysta z lomboka (gettery, settery)
@AllArgsConstructor // konstruktor z wszystkimi paramentrami
public class Employee {
    private String name, lastname;
    private final String PESEL;
    private LocalDate emplDate;
    private LocalDate birthDate;
    private double salaryNet;
}
