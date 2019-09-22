package by.bemn.java_intro_online.lesson02_algorithmization.array_multi;

import java.util.Scanner;

//  Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//              |   1     2       3   ...   n     |
//              |   n   n-1      n-2  ...   1     |
//              |   1     2       3   ...   n     |
//              |   n   n-1      n-2  ...   1     |
//              |   .     .        .  .     .     |
//              |   .     .        .   .    .     |
//              |   .     .        .    .   .     |
//              |   n   n-1      n-2  ...   1     |

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrix[n][n] \nEnter n : ");
        int n = scanner.nextInt();
        while (n%2 != 0) {
            System.out.println("Try again!!! \nEnter n : ");
            n = scanner.nextInt();
        }

        int[][] array = new int[n][n];

        for (int i = 0; i <array.length ; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if ((i+1) % 2 == 0) {
                    array[i][j] = array[i].length - j;
                } else {
                    array[i][j] =j+1;
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
