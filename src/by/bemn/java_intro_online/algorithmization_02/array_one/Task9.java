package by.bemn.java_intro_online.algorithmization_02.array_one;

import java.util.Scanner;

// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter capacity n = ");
        int n = scanner.nextInt();

//   For test
//        int[] array = {50, 10, -10, 20, 50, 40, -10, 50, 60, 10, 10};
//        int[] array = {50, 10, 10, 20, 30, 40, 10, 50, 60, 10, 20};

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 100 - 50));
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }


        int countMax = 0;
        int elenentMaxCount = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int countTemp = 1;

            for (int j = i+1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    countTemp ++;
                }
            }

            if (countMax < countTemp) {
                countMax = countTemp;
                elenentMaxCount = array[i];
            } else if (countMax == countTemp) {
                elenentMaxCount = elenentMaxCount < array[i] ? elenentMaxCount : array[i];
            }
        }

        System.out.println("\n" + elenentMaxCount);
    }
}
