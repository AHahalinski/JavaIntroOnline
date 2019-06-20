package by.bemn.java_intro_online.algorithmization_02.array_multi;

import java.util.Scanner;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//              |   1   1   1   ... 1   1   1   |
//              |   0   1   1   ... 1   1   0   |
//              |   0   0   1   ... 1   0   0   |
//              |   .   .   .   .   .   .   .   |
//              |   .   .   .    .  .   .   .   |
//              |   .   .   .     . .   .   .   |
//              |   0   1   1   ... 1   1   0   |
//              |   1   1   1   ... 1   1   1   |

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrix[n][n] \nEnter n : ");
        int n = scanner.nextInt();
        while (n % 2 != 0) {
            System.out.println("Try again!!! \nEnter n : ");
            n = scanner.nextInt();
        }
        int[][] array = new int[n][n];

        for (int i = 0; i < n / 2; i++) {

            for (int j = 0; j < n / 2; j++) {

                if (i > j) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                    array[n - i - 1][n - j - 1] = 1;
                    array[i][n - j - 1] = 1;
                    array[n - 1 - i][j] = 1;
                }

            }

        }

        for (int i = 0; i < array.length; i++) {

            for (int i1 = 0; i1 < array[i].length; i1++) {
                System.out.printf("%5d", array[i][i1]);
            }

            System.out.println();
        }
    }
}
