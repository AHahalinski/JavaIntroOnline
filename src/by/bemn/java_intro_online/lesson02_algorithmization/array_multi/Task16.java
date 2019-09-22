package by.bemn.java_intro_online.lesson02_algorithmization.array_multi;

import java.util.Scanner;

// Магическим квадратом порядка n называется квадратная матрица размера n^2, составленная
// из чисел 1, 2, 3,...,n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших
// диагоналей равны между собой. Построить такой квадрат.
// Пример магического квадрата порядка 3:   6 1 8
//                                          7 5 3
//                                          2 9 4

public class Task16 {
    private static int[][] magicSquare;
    private static int n = 0;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter N(n>=3) = ");
            n = in.nextInt();
        } while (n < 3);

        magicSquare = magicSquate(n);

        System.out.println("\nMagic Square:");
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare[i].length; j++) {
                System.out.print(magicSquare[i][j] + "\t");
            }
            System.out.println();
        }
    }


    private static int[][] magicSquate(int sizeMatrix) {
        //нечетное n
        if ((n - 1) % 2 == 0) {
            magicSquare = magicSquare3();
//кратно 4
        } else if (n % 4 == 0) {
            magicSquare = magicSquare4(n);
//кратно 2
        } else {
            magicSquare = magicSquare2();
        }
        return magicSquare;
    }

    private static int[][] magicSquare3() {
        magicSquare = new int[n][n];

        int i = 0;
        int j = (n - 1) / 2;
        magicSquare[i][j] = 1;
        i--;
        j++;

        for (int element = 2; element <= n * n;  element++, i--, j++) {
            if (i < 0 && j > n - 1) {
                i += 2;
                j--;
            }
            if (i < 0) {
                i = n - 1;
            }
            if (j > n - 1) {
                j = 0;
            }
            if (magicSquare[i][j] != 0) {
                i += 2;
                j--;
            }
            magicSquare[i][j] = element;
        }
        return magicSquare;
    }

    private static int[][] magicSquare4(int n) {

        magicSquare = new int[n][n];
        int element = 1;

        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                magicSquare[i][j] = element;
                element++;
            }
        }

        int tempElement;

        for (int i = 0; i < magicSquare.length / 2; i++) {
            for (int j = 0; j < magicSquare.length / 2; j++) {
                if (i == j) {
                    tempElement = magicSquare[i][j];
                    magicSquare[i][j] = magicSquare[magicSquare.length - 1 - i][magicSquare.length - 1 - j];
                    magicSquare[magicSquare.length - 1 - i][magicSquare.length - 1 - j] = tempElement;
                }
            }
        }

        for (int i = 0, j = magicSquare.length - 1 - i; i <= (magicSquare.length / 2) - 1; ++i, --j) {
            tempElement = magicSquare[i][j];
            magicSquare[i][j] = magicSquare[j][i];
            magicSquare[j][i] = tempElement;
        }

        return magicSquare;
    }

    private static int[][] magicSquare2() {
        int[][] magicSquare2 = new int[n][n];
        int[][] matrixTemp = magicSquare4(n - 2);

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                magicSquare2[i][j] = matrixTemp[i - 1][j - 1] + 2 * (n - 1);
            }
        }

        int k = n * n + 1;

        magicSquare2[0][0] = 3 * n / 2 - 1;
        magicSquare2[0][n - 1] = 1;
        magicSquare2[n - 1][0] = k - 1;
        magicSquare2[n - 1][n - 1] = k - 3 * n / 2 + 1;

        int i = 0;
        int j = 0;
        for (i = 1; i <= n / 2 - 2; i++) {
            magicSquare2[0][i] = 2 * i + 1;
        }
        for (j = 1; j <= n / 2; j++) {
            magicSquare2[0][j + i - 1] = k - 2 * j;
        }

        for (j = 1; j < n - 1; j++) {
            magicSquare2[n - 1][j] = n * n + 1 - magicSquare2[0][j];
        }

        magicSquare2[1][0] = 2 * n / 2 - 1;
        for (i = 1; i <= n / 2 / 2; i++) {
            magicSquare2[i + 1][0] = 3 * n / 2 - 1 - i;
        }

        i--;

        for (j = 1; j <= n / 2 / 2 + 1; j++) {
            magicSquare2[i + j + 1][0] = k - 4 * n / 2 + 1 + j;
        }

        j--;

        for (int q = 1; q <= n / 2 / 2 - 1; q++, i++) { //??
            magicSquare2[i + j + q + 1][0] = 3 * n / 2 - 1 + q;
            magicSquare2[i + j + q + 2][0] = k - 2 * n / 2 - q;
        }

        for (i = 1; i < n - 1; i++) {
            magicSquare2[i][n - 1] = n * n + 1 - magicSquare2[i][0];
        }

        return magicSquare2;
    }
}
