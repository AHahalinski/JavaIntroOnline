package by.bemn.java_intro_online.lesson02_algorithmization.array_one;

// Дан массив действительных чисел, размерность которого N.
// Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter capacity array N : ");
        int n = scanner.nextInt();

        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * n * 2 - n;
        }

        int countPositive = 0;
        int countNegative = 0;
        int countNull = 0;

        for (double element : array) {

            if (element > 0) {
                countPositive++;
            } else if (element < 0) {
                countNegative++;
            } else {
                countNull++;
            }

        }

        System.out.println("countPositive = " + countPositive + "\n"
                + "countNegative = " + countNegative + "\n"
                + "countNull = " + countNull);
    }
}
