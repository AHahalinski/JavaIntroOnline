package by.bemn.java_intro_online.lesson02_algorithmization.array_multi;

import java.util.Scanner;

// В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
// на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
// пользователь с клавиатуры.

public class Task8 {
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

        System.out.print("\nEnter column '1'  : ");
        int column_1 = scanner.nextInt();

        while (column_1 <= 0 || column_1 >= array.length) {
            System.out.println("Column '" + column_1 + "' not exist!\nTry again");
            column_1 = scanner.nextInt();
        }

        System.out.print("\nEnter column '2'  : ");
        int column_2 = scanner.nextInt();

        while (column_2 <= 0 || column_2 >= array.length) {
            System.out.println("Column '" + column_2 + "' not exist!\nTry again");
            column_2 = scanner.nextInt();
        }

        int[] arrayTemp = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayTemp[i] = array[i][column_1-1];
        }

        for (int i = 0; i < array.length; i++) {
            array[i][column_1-1] = array[i][column_2-1];
            array[i][column_2-1] = arrayTemp[i];
        }

        System.out.println("Result matrix\n********************");

        for (int i = 0; i < array.length; i++) {

            for (int i1 = 0; i1 < array[i].length; i1++) {
                System.out.printf("%5d", array[i][i1]);
            }

            System.out.println();
        }
    }
}
