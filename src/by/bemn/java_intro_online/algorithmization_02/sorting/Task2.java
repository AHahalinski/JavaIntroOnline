package by.bemn.java_intro_online.algorithmization_02.sorting;

import java.util.Scanner;

// Даны две последовательности a1 < a2 <...< an и b1 < b2 <...< bm.
// Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
// Примечание. Дополнительный массив не использовать.

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array1  N : ");
        int sizeArray_1 = scanner.nextInt();
        System.out.print("Enter size of array2  N : ");
        int sizeArray_2 = scanner.nextInt();
        int[] array_2 = generateArray(sizeArray_2);

        int[] array_1 = generateArray(sizeArray_1);
        System.out.print("Array a : [ ");
        for (int i : array_1) {
            System.out.print(i + "\t");
        }
        System.out.println(" ]");

        System.out.print("Array b : [ ");
        for (int i : array_2) {
            System.out.print(i + "\t");
        }
        System.out.println(" ]");

        int[] array_12 = new int[array_1.length + array_2.length];

        for (int i = 0; i < array_12.length; i++) {
            if (i < array_1.length) {
                array_12[i] = array_1[i];
            } else {
                array_12[i] = array_2[i - array_1.length];
            }
        }

        for (int i = 0; i < array_12.length + 1; i++) {
            for (int j = i; j < array_12.length; j++) {
                int temp;
                if (array_12[i] > array_12[j]) {
                    temp = array_12[i];
                    array_12[i] = array_12[j];
                    array_12[j] = temp;
                }
            }
        }

        for (int i : array_12) {
            System.out.print(i + "\t");
        }
    }

    private static int[] generateArray(int sizeArray) {
        int[] array = new int[sizeArray];
        array[0] = (int) (Math.random() * 100)/sizeArray;
        for (int i = 1; i < array.length; i++) {
            while (true) {
                array[i] = (int) (Math.random() * 1000)/(array.length-i);
                if(array[i] > array[i-1]) {
                    break;
                }
            }
        }
        return array;
    }

}
