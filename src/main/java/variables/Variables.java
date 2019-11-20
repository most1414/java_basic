package variables;

public class Variables {
    public static void main(String[] args) {
        int age; //inicjalizacja - pierwsze przypisanie wartosci
        age = 18;
        System.out.println("wiek: " + age);
        // deklaracja i nicjalizacja
        double result = 0.01;
        System.out.println("Wynik: " + result);
        // modyfikacja wartosci w zmiennej
        age = age + 5;
        age += 5; //+= to age + 5
        System.out.println("Wiek: " + age);
        final byte HOURS_IN_DAY = 24;
        final boolean DECISION;
        //HOURS_IN_DAY - 23 - blad
        DECISION = true;
        //DECISION - False - Blad

    }
}


