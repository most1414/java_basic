package Java_introduction;
// ctrl + slash - komentarz jednowierszowy
/*ctrl + shift + slash - komentarz blokowy*/
// psvm nam gegenruje public static void main(String[] args) {
// ctrl + shift + f10 - run program
// ctrl + D - duplikowanie linii
public class introduction {
    // metoda uruchomieniowa
    // automatycznie uruchamiana jako pierwsza w trakcie uruchamiania projektu
    public static void main(String[] args) {
        // sout - polecenie wypisujace wartosci podane w arguencie metody
        System.out.println("Hello World"); // na koncu zawsze srednik
        // pobranie numeru wersji JRE
        System.out.println(System.getProperty("java.runtime.version"));
        System.out.println(System.getProperty("java.version"));

        // typy danych
        int myFirstNumber = 5556666;
        System.out.println("myFirstNumber = " + myFirstNumber);
        //  byte mySmallnumber - 5556666666666; - blad, zbyt mala precyzja typu byte
        System.out.println("dodawanie liczb: "+ (100 + myFirstNumber));
        double salaryNet = 9000;
        int vatTax = 23;
        System.out.println("kwota netto:" + salaryNet + "zł");
        System.out.println("kwota brutto:" + salaryNet + (1 + (vatTax/100.0)));
        System.out.printf("kwota brutto: %.2f zł\n", salaryNet + (1 + (vatTax/100.0)));
        System.out.printf("%.2fzł netto to %.2fzł brutto\n", salaryNet, salaryNet, salaryNet + (1 + (vatTax)) );
        char smallLetter = 'a';
        char bigLetter = 'A';
        System.out.println(smallLetter);
        System.out.println((char)(bigLetter +10));

        boolean isActivated = true;
        System.out.println(isActivated);
        System.out.println(!isActivated);

    }
}
