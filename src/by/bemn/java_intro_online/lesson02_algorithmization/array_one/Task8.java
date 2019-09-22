package by.bemn.java_intro_online.lesson02_algorithmization.array_one;

import java.util.Scanner;

// Дана последовательность целых чисел a_1, a_2 ... a_n.
// Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a_1, a_2 ... a_n).

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter capacity: n = ");
        int n = scanner.nextInt();

        double[] array = new double[n];
        double min = Double.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 2000 - 1000)) / 100d;

            if (array[i] < min) {
                min = array[i];
            }
        }

        int countIndex = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                countIndex--;
            }
        }

        double[] arrayWithoutMin = new double[countIndex];
        int beginIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                arrayWithoutMin[beginIndex++] = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }

        System.out.println("\n -----------------------------");

        for (int i = 0; i < arrayWithoutMin.length; i++) {
            System.out.print(arrayWithoutMin[i] + "; ");
        }
    }
}
