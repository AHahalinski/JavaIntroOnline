package by.bemn.java_intro_online.algorithmization_02.array_multi;

import java.util.Scanner;

//  Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrix[y][x] \nEnter y : ");
        int y = scanner.nextInt();

        System.out.print("Enter x : ");
        int x = scanner.nextInt();

        int[][] array = new int[y][x];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((Math.random() * 100 - 50));
                System.out.printf("%5d", array[i][j]);
            }

            System.out.println();
        }
        System.out.print("\nEnter line 'k'  : ");
        int k = scanner.nextInt();

        if (k <= y && k > 0) {
            System.out.println(" Elements of line 'k' \n ********************************");

            for (int i = 0; i < array[k].length; i++) {
                System.out.printf("%5d", array[k - 1][i]);
            }

        } else {
            System.out.println("Line '" + k + "' doesn't exist");
        }

        System.out.print("\n\n Enter column p  : ");
        int p = scanner.nextInt();

        if (p <= x && p > 0) {
            System.out.println(" Element of column 'p' \n ********************************");

            for (int i = 0; i < array.length; i++) {
                System.out.printf("%5d \n", array[i][p - 1]);
            }

        } else {
            System.out.println("Column '" + p + "' doesn't exist");
        }

    }
}
