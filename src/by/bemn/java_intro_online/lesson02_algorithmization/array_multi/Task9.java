package by.bemn.java_intro_online.lesson02_algorithmization.array_multi;

import java.util.Scanner;

// Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
// Определить, какой столбец содержит максимальную сумму.

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrix[y][x] \nEnter y : ");
        int y = scanner.nextInt();

        System.out.print("Enter x : ");
        int x = scanner.nextInt();

        int[][] array = new int[y][x];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((Math.random() * 100));
                System.out.printf("%5d", array[i][j]);
            }

            System.out.println();
        }

        int[] sumElementsColumn = new int[x];

        int indexMaxSum = 0;
        for (int i = 0; i < x; i++) {
            for (int i1 = 0; i1 < array.length; i1++) {
                sumElementsColumn[i]+=array[i1][i];
            }
            if (sumElementsColumn[indexMaxSum] < sumElementsColumn[i]) {
                indexMaxSum = i;
            }
        }

        System.out.println("\nMax sum in column № " + (indexMaxSum+1));

    }
}
