package exercises;

import exercises.controller.AutoController;
import exercises.model.Engine;
import exercises.model.Fuel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        AutoController ac = new AutoController();
        // dodanie trzech aut do zamowienia
        ac.addAuto("vw", "passat", Engine.v2_0, Fuel.diesel, 120000);
        ac.addAuto("vw", "golf", Engine.v1_5, Fuel.diesel, 150000);
        ac.addAuto("vw", "tiguan", Engine.v3_0, Fuel.diesel, 1900000);
        // wypisz liste aut
        ac.printAllAutos();
        // usun auto
        System.out.println("Usunieto: "+ ac.deleteAutoById(2));
        ac.printAllAutos();
        // daj rabat 10% dla auta 1
        System.out.println("Obnizona cena: "+ ac.discountAutoById(1,10));
        // podnies cene wszystkich aut o 5%
        ac.changeAllAutosPrice(false, 5);
        ac.printAllAutos();

        // dodajemy GUI
        Scanner scanner = new Scanner(System.in);
        int decision = ' ';
        // iterujemy dopoki nie wybrano Q
        while(decision != 'Q'){
            System.out.println("PANEL FABRYKI AUT");
            System.out.println("(Z) - zamow auto");
            System.out.println("(P) - pokaz liste zamowionych aut");
            System.out.println("(U) - usun auto");
            System.out.println("(R) - daj rabat na auto");
            System.out.println("(C) - zmien cene wszystkich aut");
            System.out.println("(Q) - wyjscie");
            decision = scanner.nextLine().toUpperCase().charAt(0);
            switch (decision){
                case 'Z':
                    break;
                case 'P':
                    ac.printAllAutos();
                    break;
                case 'U':
                    System.out.println("Wybierz number auta ktore chcesz usunac:");
                    ac.printAllAutos();
                    int id = scanner.nextInt();
                    System.out.println("Usunieto: "+ ac.deleteAutoById(id));
                    break;
                case 'R':
                    break;
                case 'C':
                    System.out.println("(+) - podnies cene");
                    System.out.println("(-) - obniz cene");
                    boolean isDiscounted = scanner.nextLine().isEmpty();
               //     scanner.nextLine();
                    System.out.println("Wprowadz %");
                    ac.changeAllAutosPrice(isDiscounted, scanner.nextInt());
                    ac.printAllAutos();
                    scanner.nextLine();
                    break;
                case 'Q':
                    System.out.println("Do zobaczenia!");
                    break;
                    default:
                        System.out.println("Bledny wybor");
            }

        }
    }
}