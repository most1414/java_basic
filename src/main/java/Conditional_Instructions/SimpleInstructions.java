package Conditional_Instructions;

import java.time.LocalDate;
import java.util.Scanner;

public class SimpleInstructions {
    public static void main(String[] args) {
        int age = 55;
        if (age >= 0 && age <= 120) {
            System.out.println("CZLOWIEK - sprawdzam dalej");
            if (age > 18) {
                System.out.println("CZLOWIEK DOROSLY");
            } else if (age == 18){
                System.out.println("CZLOWIEK NIEPELNOLETNI");
            }
        }else{
            System.out.println("ROBOT");
            }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("ZERO");
        }else if (number %2 == 0) {
            System.out.println("PARZYSTA");
        }else{
            System.out.println("NIEPARZYSTA");

        }
        //Sprawdz czy liczba podana przez uzytkownika jest parzysta
        // Jesli tak to wypisz "PARZYSTA", jesli nie - wypisz "NIEPARZYSTA"
        // Jesli zero wypisz "zero"
    // generowaniedaty aktualnej
    //    System.out.println(LocalDate.now());
        // if(warunek?){
        // } else if (warunek 2){}
    }

    }

