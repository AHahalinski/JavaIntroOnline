package by.bemn.java_intro_online.lesson02_algorithmization.array_one;

import java.util.Scanner;

// Задана последовательность N вещественных чисел.
// Вычислить сумму чисел, порядковые номера которых являются простыми числами.

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter capacity N : ");
        int n = scanner.nextInt();

        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 2000 - 1000)) / 100d;
        }

        double sum = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 2; j <= i; j++) {

                if (i % j == 0) {
                    if(i==j) {
                        sum += array[i];
                    } else {
                        break;
                    }
                }

            }
        }

        System.out.println("sum = " + sum);
    }
}
