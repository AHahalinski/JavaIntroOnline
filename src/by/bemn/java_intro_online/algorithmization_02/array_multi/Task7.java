package by.bemn.java_intro_online.algorithmization_02.array_multi;

import java.util.Scanner;

// Сформировать квадратную матрицу порядка N по правилу:
// A[I, J] = sin((I^2 - J^2)/N)
// и подсчитать количество положительных элементов в ней.

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrix[N][N] \nEnter N : ");
        int n = scanner.nextInt();

        double[][] array = new double[n][n];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = Math.sin((i*i - j*j)/array.length);
            }

        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {

            for (int i1 = 0; i1 < array[i].length; i1++) {

                if(array[i][i1] > 0) {
                    count ++;
                }
                System.out.printf( "%8.3f", array[i][i1]);
            }

            System.out.println();
        }

        System.out.println("Count elements : " + count);
    }
}
