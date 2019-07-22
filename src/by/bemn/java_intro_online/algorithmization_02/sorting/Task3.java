package by.bemn.java_intro_online.algorithmization_02.sorting;

import java.util.Scanner;

// Сортировка выбором. Дана последовательность чисел a1, a2, ..., an .Требуется переставить элементы так,
// чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
// элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
// повторяется. Написать алгоритм сортировки выбором.

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array  N : ");
        int sizeArray = scanner.nextInt();

        int[] array = generateArray(sizeArray);

        System.out.print("Array before sorting [ ");
        print(array);
        System.out.println("]");

        sortSelection(array);

        System.out.print("Array after sorting  [ ");
        print(array);
        System.out.println("]");
    }

    private static void sortSelection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int indexMax = i;

            for (int j = i; j < array.length; j++) {
                if (array[indexMax] < array[j]) {
                    indexMax = j;
                }
            }

            int temp = array[i];
            array[i] = array[indexMax];
            array[indexMax] = temp;
        }
    }


    private static int[] generateArray(int sizeArray) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + "\t");
        }
    }
}
