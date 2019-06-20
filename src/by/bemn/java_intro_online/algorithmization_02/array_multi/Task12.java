package by.bemn.java_intro_online.algorithmization_02.array_multi;

import java.util.Scanner;

// Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task12 {
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
                array[i][j] = (int) ((Math.random() * 100 - 50));
            }
        }
// Исходная матрича
        print(false);

        for (int i = 0; i < array.length; i++) {
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;

                for (int j = 1; j < array[i].length; j++) {
                    if (array[i][j - 1] > array[i][j]) {
                        isSorted = false;
                        int temp = array[i][j];
                        array[i][j] = array[i][j - 1];
                        array[i][j - 1] = temp;
                    }
                }

            }
        }
// по возрастанию
        print(false);

//        for (int i = 0; i < array.length; i++) {
//            boolean isSorted = false;
//            while (!isSorted) {
//                isSorted = true;
//
//                for (int j = 1; j > array[i].length; j++) {
//                    if (array[i][j - 1] > array[i][j]) {
//                        isSorted = false;
//                        int temp = array[i][j];
//                        array[i][j] = array[i][j - 1];
//                        array[i][j - 1] = temp;
//                    }
//                }
//
//            }
//        }
// по убыванию
        print(true);
    }

    private static void print(boolean revers) {
        int h = 0;

        System.out.println("\nMatrix");
        for (int i = 0; i < array.length; i++) {
            if(revers) {
                h = array[i].length - 1;
            }
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%5d", array[i][Math.abs(h-j)]);
            }
            System.out.println();
        }
    }
}
