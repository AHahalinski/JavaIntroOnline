package by.bemn.java_intro_online.algorithmization_02.array_multi;

// Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк,
// в которых число 5 встречается три и более раз.

public class Task11 {
    public static void main(String[] args) {
        int[][] array = new int[10][20];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((Math.random() * 16));
                System.out.printf("%5d", array[i][j]);
            }

            System.out.println();
        }


        for (int i = 0; i < array.length; i++) {
            int count5 = 0;

            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] == 5) {
                    count5++;
                }

            }

            if (count5 >= 3) {
                System.out.println(i+1);
            }
        }
    }
}
