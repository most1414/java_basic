package variables;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;
        // post inkremenmtacja
        System.out.println(i++);
        System.out.println(i);

        // pre dekrementacja
        System.out.println(--j);
        // po wypisaniu
        System.out.println(j);
        // jaki wynik -> i = 6 j = 3
        System.out.println("Wynik: " + ((j++)*(--i + j--) + (++i)));
        // 3 * (5 + 4) + (6) = 33

        // sprawdz czy uzytkownik ma 18 lat
        // jezeli jego wiek jest wiekszy lub rowny 18 to wypisz "jestes pelnoletni" w przeciwnym razei wypisz "nie jestes pelnoetni"
        int age;
                Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz swoj wiek: ");
        age = scanner.nextInt();
                String isMature = age >= 18 ? "jesteś pełnoletni" : "nie jestes dorosly";
        System.out.printf("Twoj wiek to : %d = %s\n", age, isMature);
        // inna opcja
        // boolean isHuman = age >= 0 && age <= 120 ? true : false;
        // System.out.println(isHuman ? isMature : "ROBOT");

    }
}
