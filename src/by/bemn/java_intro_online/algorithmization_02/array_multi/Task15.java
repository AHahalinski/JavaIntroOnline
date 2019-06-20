package by.bemn.java_intro_online.algorithmization_02.array_multi;

import java.util.Scanner;

// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task15 {
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

        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {

            for (int i1 = 0; i1 < array[i].length; i1++) {

                if (maxElement < array[i][i1]) {
                    maxElement = array[i][i1];
                }
            }
        }

        for (int i = 0; i < array.length; i++) {

            for (int i1 = 0; i1 < array[i].length; i1++) {

                if (array[i][i1] % 2 != 0) {
                    array[i][i1] = maxElement ;
                }
            }
        }

//        for (int i = 0; i < array.length; i++) {
//
//            for (int i1 = 0; i1 < array[i].length; i1++) {
//
//                if ((i+i1+1) % 2 != 0) {
//                    array[i][i1] = maxElement ;
//                }
//            }
//        }

        System.out.println("Result matrix\n********************");
        for (int i = 0; i < array.length; i++) {

            for (int i1 = 0; i1 < array[i].length; i1++) {
                System.out.printf("%5d", array[i][i1]);
            }

            System.out.println();
        }
    }
}
