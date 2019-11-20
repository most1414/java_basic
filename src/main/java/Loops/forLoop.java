package Loops;

public class forLoop {
    public static void main(String[] args) {
        String sentence = "Ala ma kota";
        // wypisz w petli wszystkie znaki napisu pojedynczo
        // Ala ma kota  znaki
        //012345678910  indeksy
        for (int i = 0; i <= sentence.length() - 1; i++) {
            if (sentence.charAt(i) != ' ') { // pominelo spacje
                System.out.printf("indeks: %d znak: %c\n", i, sentence.charAt(i));
            }
        }
        // tablica - zmienna przechowujaca zestaw wartosci uporzadkowanych po indeksach
        // index 0 -> 2
        // index 1 -> 4
        // index 2 -> 6
        // index 3 -> 8
        int numbers [] = {2,4,6,8};
        // for (typ pojedynczej wartosci nazwa podreczna : kolekcja wartosci)
        int index =0;
        for (int number : numbers) {
            System.out.printf("wartosc: %d\n", number);
            index++;
        }
    }
}