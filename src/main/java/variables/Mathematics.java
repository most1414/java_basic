package variables;

public class Mathematics {
    public static void main(String[] args) {
        final double PI = Math.PI;
        // x do potegi y
        // pow = double np x razy y
        int x = 5;
        int y = 2;
        double result = Math.pow(x,y);
        System.out.println(result);
        // pierwiastek 3ciego stopnia z 16
        System.out.println(Math.pow(16, (1.0/3)));

        int a = 5;
        int b = 8;
        // wynik dzialania jest typu skladnikow dzialania
        System.out.println(a*b);
        // konwersja rozszerzajaca
        System.out.println(((double)a)/b);
        //konwersja zawerzajaca -> konwersja do typu o nizszej precyzji (z zaokragleniem)
        double measure = 1.443;
        System.out.println((int)measure);

        char sign = 'a';
        sign++;
        System.out.println(sign);
    }
}
