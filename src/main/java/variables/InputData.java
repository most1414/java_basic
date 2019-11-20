package variables;

import java.util.Locale;
import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // wprowadzam liczbe
        System.out.println("Wprowadz liczbe zmiennoprzecinkowa: ");
        double number = scanner.nextInt(); // wprowadzam inti enter -> \n
        // aby skonsumowac enter wykonujemy metode nextLine()
        String enter = scanner.nextLine();
        // wprowadzam napis
        System.out.println("Wprowadz napis:");
        String text = scanner.nextLine();
        System.out.printf("Wprowadziles: %f i %s", number, text);
        System.out.printf("Skonsumowano: \n", enter);
        //zamkniecie polaczenia
        scanner.close();
    }
}
