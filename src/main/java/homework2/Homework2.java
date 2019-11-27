package homework2;

import java.time.Duration;
import java.time.LocalTime;

public class Homework2 {
   private String text;
   public Homework2(String text){
       this.text=text;
   }
   public int getSize() {
       return 0;
   }
public int getSizeWithoutSpaces(){
    return text.length() - text.replaceAll(" ","").length();
}

    public static void main(String[] args) {
       Homework2 homework2 = new Homework2("Ala ma kota a kot ma Ale");
        System.out.println("Dlugosc napisu: "+ homework2.getSize());
        LocalTime tStart = LocalTime.now();
        System.out.println("Ilosc spacji: "+ homework2.getSizeWithoutSpaces());
        LocalTime tStop = LocalTime.now();
        Duration dt = Duration.between(tStop,tStart);
        System.out.println(dt);
        tStart = LocalTime.now();
      //  System.out.println("Ilosc spacji: "+ homework2.getSizeWithoutSpaces());
        tStop = LocalTime.now();
        dt = Duration.between(tStart, tStop);
        System.out.println(dt.getNano());

    }
}
