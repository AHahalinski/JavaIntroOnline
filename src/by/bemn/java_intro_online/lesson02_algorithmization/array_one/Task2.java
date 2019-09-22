package by.bemn.java_intro_online.lesson02_algorithmization.array_one;

import java.util.Scanner;

// Дана последовательность действительных чисел а1 ,а2 ,..., аn.
// Заменить все ее члены, большие данного Z, этим числом.
// Подсчитать количество замен.

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter capacity array N : ");
        int n = scanner.nextInt();

        System.out.print("Enter Z : ");
        double z = scanner.nextDouble();

        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * n * 2 - n;
        }

        int countOfChanges = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                countOfChanges++;
            }
        }

        System.out.println("Count : " + countOfChanges + "\n");
        System.out.println("Array : ");
        for (double element : array) {
            System.out.println(element);
        }
    }
}
