package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexStart {
    public static void main(String[] args) {
        while (true) {

            // pattern to nasz wzorzec zawierajacy wyrazenia regularne
            // PESEL
            //     String patternPESEL = "^[0-9]{11}$";
            //     String patternDate = "^[1-2]{1}[0-9]{3}-(0[1-9]{1}|1[0-2]{1})-(0[1-9]{1}|[12]{1}[0-9]{1}|3[01]{1})$";
            //min 8 znakow - haslo:
            // jedna litera wielka
            // jedna cyfra
            // jeden znak specjalny (_.&)
            // bez spacji
            System.out.println("Podaj adres email uzytkownika");
            String mail = new Scanner(System.in).nextLine();
            String patternLowerCase = ".*[a-z]{1,}.*";
            String patternUpperCase = ".*[A-Z]{1,}.*";
            String patternDigit = ".*[0-9]{1,}.*";
            String patternSpecialCharacter = ".*[-_.&!]{1,}.*";
            String patternWithoutSpace = ".*[\\s|\\t]{1,}.*";
            String patternMail = "^([a-z]|[A-Z]|[0-9]|[._#]|[^\\s\\t]){1,}@([a-z]|[A-Z]|[0-9]|[._#]|[^\\s\\t]){1,}\\.([a-z]|[A-Z]|[^\\s\\t]){2,}$";


            //  moj String patternMail = ".*[a-z]{1,}[@]{1}[a-zA-Z0-9]{4}[.]{1}[p]{1}[l]{1}";

            // walidacja adresu email
            if (Pattern.matches(patternMail,mail)) {
                System.out.println("Adres email jest OK");
            } else {
                System.out.println("Bledny adres email");
                continue;
            }
                System.out.println("Podaj haslo uzytkownika");
                String password = new Scanner(System.in).nextLine();
            if (password.length() < 8) {
                System.out.println("Hasło musi zawierać co najmniej 8 znaków");
            } else if (!Pattern.matches(patternLowerCase, password)) {
                System.out.println("Hasło musi posiadać co najmniej jedną małą literę");
            } else if (!Pattern.matches(patternUpperCase, password)) {
                System.out.println("Hasło musi posiadać co najmniej jedną wielką literę");
            } else if (!Pattern.matches(patternDigit, password)) {
                System.out.println("Hasło musi posiadać co najmniej jedną cyfre");
            } else if (!Pattern.matches(patternSpecialCharacter, password)) {
                System.out.println("Hasło musi posiadać co najmniej jeden znak specjalny {-_.&!}");
            } else if (Pattern.matches(patternWithoutSpace, password)) {
                System.out.println("Hasło nie może zawierać znaków białych");
            } else {
                System.out.println("Hasło jest ok!");
                break;
            }
        }


        }
    }

// data urodzenia jako regex
