package Loops;

public class OmittingInstructions {
    public static void main(String[] args) {
        // program wyszukujacy okreslony znak w napisie
        // -> jesli znaleziono -> wypisz pozycje tego znaku
        // -> jesli nie znalezniono wypisz stosowny komunikat
        String sentence = "Ala ma kota a kot ma Ale.";
        char search = '.';
        boolean isFound = false;
        for(int i = 0; i < sentence.length(); i++){
            System.out.println("Iteracja nr. "+ i);
            if (sentence.charAt(i) != search) {
                // pominiecie aktualnej wykonywanej iteracji i przejscie do kolejnej
                continue;
            } else if ((sentence.charAt(i) == search)){
                System.out.printf("Znaleziono znak %c na indeksie %d\n", sentence.charAt(i),i);
                isFound = true;
                // instrukcja przerywajaca dzialanie petli
                break;
            }
            System.out.println("Nic waznego");
        }
        if(!isFound){
            System.out.printf("Nie znaleziono znaku %c w tekscie %s\n", search, sentence);
        }
        System.out.println("=====");
        for( int i = 0; i < 10; i++){
            if(i == 5)
                continue;
            System.out.println(i);
        }


    }
}