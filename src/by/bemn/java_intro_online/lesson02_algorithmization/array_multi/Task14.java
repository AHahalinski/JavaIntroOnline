package by.bemn.java_intro_online.lesson02_algorithmization.array_multi;

import java.util.Scanner;
// Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
// единиц равно номеру столбца.

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrix[m][n] \nEnter m : ");
        int m = scanner.nextInt();

        System.out.print("Enter n : ");
        int n = scanner.nextInt();

        int[][] array = new int[m][n];

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < m; j++) {

                while (i != count) {
                    int index1 = (int) (Math.random() * m);

                    if (array[index1][i] != 1) {
                        array[index1][i] = 1;
                        count++;
                    }
                }
            }
        }

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }

            System.out.println();
        }
    }
}
