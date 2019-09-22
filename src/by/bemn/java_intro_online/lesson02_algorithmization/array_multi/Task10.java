package by.bemn.java_intro_online.lesson02_algorithmization.array_multi;

import java.util.Scanner;

// Найти положительные элементы главной диагонали квадратной матрицы.

public class Task10 {
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

        System.out.println("\n Element on diagonal \n ********************************");

        for (int i = 0; i < (array.length < array[0].length ? array.length : array[0].length); i++) {
            if(array[i][i] > 0) {
                System.out.printf("%5d", array[i][i]);
            }
        }
    }
}
