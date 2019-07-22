package by.bemn.java_intro_online.algorithmization_02.sorting;

import java.util.Scanner;

// Сортировка обменами. Дана последовательность чисел a1, a2, ..., an .Требуется переставить числа в
// порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1 . Если ai > ai+1 , то делается
// перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
// Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array  N : ");
        int sizeArray = scanner.nextInt();

        int[] array = generateArray(sizeArray);

        System.out.print("Array before sorting [ ");
        print(array);
        System.out.println("]");

        sortBubble(array);

        System.out.print("Array after sorting  [ ");
        print(array);
        System.out.println("]");
    }

    private static void sortBubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    private static int[] generateArray(int sizeArray) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
        }
        return array;
    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + "\t");
        }
    }
}
