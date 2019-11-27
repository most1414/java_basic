package homework;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        String name = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz imie: ");
        name = scanner.nextLine();
        if (name.charAt(name.length()-1)== 'a'){
            System.out.println("Imie zenskie");
        }else{
            System.out.println("Imie meskie");
        }
    }
}
