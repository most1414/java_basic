package bigNumbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("876554869");
        BigInteger bigInteger2 = new BigInteger("87679869");

        // metody klasy bigInteger
        BigInteger bigIntergerAdd = bigInteger1.add(bigInteger2);
        BigInteger bigIntergerSub = bigInteger1.subtract(bigInteger2);
        BigInteger bigIntergermulti = bigInteger1.multiply(bigInteger2);
        BigInteger bigIntergerDiv = bigInteger1.divide(bigInteger2);
        System.out.println(bigIntergerAdd);
        System.out.println(bigIntergerSub);
        System.out.println(bigIntergermulti);
        System.out.println(bigIntergerDiv);

        BigDecimal bigDecimal = new BigDecimal("88888888888888888588");
        System.out.println(bigDecimal.add(new BigDecimal("66656565656565")));
    }
}
