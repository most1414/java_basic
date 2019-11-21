package datetimeVariables;

import java.time.LocalDate;

public class ExerciseDateTime {
    public static void main(String[] args) {
        // znajdz dzien tygodnia w ktorym sie urodziles
        LocalDate birthdate = LocalDate.of(1994,6,13);
        int myDayOfWeek = birthdate.getDayOfWeek().getValue();
        System.out.println(myDayOfWeek);
        // znajdz ile razy do dzis twoje urodziny przypadaly w ten sam dzien tygodnia w ktorym sie urodziles
        LocalDate actual = LocalDate.now();
        int counter =0;
        for (birthdate.getYear(); birthdate.getYear() <= actual.getYear(); birthdate = birthdate.plusYears(1)) {
            if (myDayOfWeek == birthdate.getDayOfWeek().getValue()){
                System.out.println(birthdate);
                counter++;
            }

        }
    }
}
