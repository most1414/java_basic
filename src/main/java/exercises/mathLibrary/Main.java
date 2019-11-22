package exercises.mathLibrary;

import exercises.controller.AutoController;
import exercises.mathLibrary.MathLibrary;
import exercises.model.Engine;
import exercises.model.Fuel;

public class Main {
    public static void main(String[] args) {
        double[] array = {2.5, 1, 5.5, 2};
        System.out.println(MathLibrary.avg(array));

        System.out.println(MathLibrary.power(2, 4));
        System.out.println(MathLibrary.factorial(5));
        System.out.println(MathLibrary.factiorialR(5));
        System.out.println(MathLibrary.fiboSum(3));


        }
    }

