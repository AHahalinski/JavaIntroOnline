package by.bemn.java_intro_online.lesson02_algorithmization.array_one;

import java.util.Scanner;

//  Даны действительные числа a_1, a_2 ... a_2n. Найти max( a_1+a_2n, a_2+a_2n-1, ... ,a_n+a_n+1 )

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter capacity: n = ");
        int n = scanner.nextInt();

        double[] array = new double[2 * n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 2000 - 1000)) / 100d;
            System.out.print(array[i] + "; ");
        }

        System.out.println();

        double max = Double.MIN_VALUE;

        for (int i = 0; i < array.length/2; i++) {
            double sum = array[i] + array[array.length - 1 - i];

            if (sum > max) {
                max = sum;
            }
        }

        System.out.println("max(a_1+a_2n, a_2+a_2n-1, ... ,a_n+a_n+1) = " + max);
    }
}
