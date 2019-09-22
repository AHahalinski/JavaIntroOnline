package by.bemn.java_intro_online.lesson02_algorithmization.array_multi;

import java.util.Scanner;

// Отсотрировать стобцы матрицы по возрастанию и убыванию значений элементов.

public class Task13 {
    private static int[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrix[y][x] \nEnter y : ");
        int y = scanner.nextInt();

        System.out.print("Enter x : ");
        int x = scanner.nextInt();

        array = new int[y][x];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((Math.random() * 100));
            }
        }
// Исходная матрича
        print(false);

        for (int j = 0; j < array[0].length; j++) {
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;

                for (int i = 0; i < array.length -1; i++) {
                    if (array[i][j] > array[i+1][j]) {
                        isSorted = false;
                        int temp = array[i][j];
                        array[i][j] = array[i+1][j];
                        array[i+1][j] = temp;
                    }
                }

            }
        }
// по возрастанию
        print(false);
// по убыванию
        print(true);
    }

    private static void print(boolean revers) {
        int h = 0;

        System.out.println("\nMatrix");
        for (int i = 0; i < array.length; i++) {
            if (revers) {
                h = array.length - 1;
            }
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%5d", array[Math.abs(i - h)][j]);

            }
            System.out.println();
        }
    }
}
