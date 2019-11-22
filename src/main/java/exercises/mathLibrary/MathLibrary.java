package exercises.mathLibrary;

public class MathLibrary {
    // 1. zaimplementuj metode zwracajaca srednia wartosci typu double podanych w argumencie metody jako tablica
    public static double avg(double [] args){
        double sum = 0;
        for (double a : args){
            sum+= a; // sum = sum + a
        }
        return sum/args.length;
    }
    // 2. zaimplementuj metode potegujaca dwie liczby calkowite
    // metoda zwraca wynik dzialania a przyjmuje jako argumenty kolejno
    // podstawe i wykladnik potegi
    public static int power(int x, int y){
        int power = 1;
        for (int i = 0; i < y; i++) {
            power *= x;
        }
        return power;
    }
    // n!
    public static long factorial(int n){
        long factorial = 1;
        for(int i =n; i > 1; i--){
            factorial *= i;
        }
        return factorial;
    }
    // 4. n! - rekurencyjnie
    public static  long factiorialR(int n){
        return (n > 1)? n* factiorialR(n - 1): 1;
    }
    //5. suma ciagu fibonacciego
    //0 1 1 2 3 5 8 13....
    public static long fiboSum(int n){
        if(n == 0){
            return 0;
        }
        long [] fibo = new long[n];
        fibo[0] = 0;
        fibo[1] = 1;
        System.out.println(fibo[0]+ " ");
        System.out.println(fibo[1]+ " ");
        long fiboSum = 1;
        for (int i = 2; i < fibo.length; i++){
            fibo[i] = fibo[i-1]+ fibo[i-2];
            System.out.println(fibo[i]+" ");
            fiboSum += fibo[i];

        }
        System.out.println();
        return  fiboSum;
    }

}
