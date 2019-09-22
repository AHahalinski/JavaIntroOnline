package by.bemn.java_intro_online.lesson02_algorithmization.array_one;

//  Даны действительные числа а1 ,а2 ,..., аn.
//  Поменять местами наибольший и наименьший элементы.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter capacity N : ");
        int n = scanner.nextInt();

        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 2 * n - n);
        }

        double elementMin = Double.MAX_VALUE;
        int indexElementMin = 0;

        double elementMax = Double.MIN_VALUE;
        int indexElementMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > elementMax) {
                elementMax = array[i];
                indexElementMax = i;
            }
            if (array[i] < elementMin) {
                elementMin = array[i];
                indexElementMin = i;
            }
        }

        for (double elem : array) {
            System.out.print(elem + ";  ");
        }
        System.out.println();

        array[indexElementMin] = elementMax;
        array[indexElementMax] = elementMin;

        for (double elem : array) {
            System.out.print(elem + ";  ");
        }
    }
}
