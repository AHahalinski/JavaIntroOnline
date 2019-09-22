package by.bemn.java_intro_online.lesson02_algorithmization.array_multi;

//  Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((Math.random() * 100 - 50));
                System.out.printf("%5d", array[i][j]);
            }

            System.out.println();
        }

        System.out.println("\n New view matrix \n ********************************");

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if ((j + 1) % 2 == 0) {
                    continue;
                }

                if (array[0][j] > array[array.length-1][j]) {
                    System.out.printf("%5d", array[i][j]);
                }

            }

            System.out.println();
        }
    }
}
