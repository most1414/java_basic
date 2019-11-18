package switch_case_intructions;

import java.util.Scanner;

public class switch_case_intructions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // CLI -> command line interface
        System.out.println("Witaj w naszej aplikacji");
        System.out.println("(L) - logowanie");
        System.out.println("(R) - rejestracja");
        System.out.println("(Q) - wyjście");
    // pobieramy tylko jeden znak (0) w charAt
        char decision = scanner.nextLine().toUpperCase().charAt(0);

        switch (decision){
  //          case 'l':
            case 'L':
                System.out.println("logowanie");
                break;
 //           case 'r':
            case 'R':
                System.out.println("rejestracja");
                break;
  //          case 'q':
            case 'Q':
                System.out.println("wyjśćie");
                break;
                default:
                    System.out.println("Zły wybór");
                    break;
        }

Grade grade = Grade.celujacy;
        switch (grade){
            case celujacy:
                System.out.println("Swietnie dostales 6");
                break;
            case bardzo_dobry:
            case dobry:
                System.out.println("Jest dobrze");
                 break;
            case dostateczny:
            case dopuszczajacy:
                System.out.println("Moglo byc lepiej");
                break;
            case niedostateczny:
                System.out.println("Tragedia");
                break;
        }
    }
}
