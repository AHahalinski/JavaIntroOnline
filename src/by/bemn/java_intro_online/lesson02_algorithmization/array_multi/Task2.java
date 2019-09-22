package by.bemn.java_intro_online.lesson02_algorithmization.array_multi;

//  Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task2 {
    public static void main(String[] args) {

        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((Math.random() * 100 - 50));
                System.out.printf("%5d", array[i][j]);
            }

            System.out.println();
        }

        System.out.println("\n Element on diagonal \n ********************************");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d", array[i][i]);
        }
    }
}
