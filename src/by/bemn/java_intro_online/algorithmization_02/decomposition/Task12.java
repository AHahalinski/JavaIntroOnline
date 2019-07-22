package by.bemn.java_intro_online.algorithmization_02.decomposition;

import java.util.Scanner;

// Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
// являются числа, сумма цифр которых равна К и которые не большее N.

public class Task12 {
    public static void main(String[] args) {
//        int K = 0;
//        while (K <= 0) {
//            K = initializationNumber("K");
//        }
//
//        int N = 0;
//        while (N <= 0) {
//            N = initializationNumber("N");
//        }

//        int[] A = generateArray(20, K, N);
        int[] A = generateArray(40, 9, 109);

        print(A);

    }

    private static int[] generateArray(int sizeArray, int sumDigits, int maxNumber) {
        int[] array = new int[sizeArray];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            int sumDigitsTemp = 0;
            int elementTemp = (int)(Math.random()*(maxNumber+1));
            int valueForCheck = elementTemp;

            do {
                sumDigitsTemp = sumDigitsTemp + valueForCheck % 10;
                valueForCheck = valueForCheck /10;

            }while(valueForCheck != 0);

            if(sumDigits == sumDigitsTemp) {
                array[i] = elementTemp;
            } else {
                i--;
            }

        }
        return array;
    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + "\t");
        }
    }

}

