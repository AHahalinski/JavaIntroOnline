package by.bemn.java_intro_online.algorithmization_02.array_one_sort;

import java.util.Scanner;

// Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
// при этом не используя дополнительный массив.

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array1  N : ");
        int sizeArray_1 = scanner.nextInt();

        System.out.print("Enter size of array2  N : ");
        int sizeArray_2 = scanner.nextInt();

        System.out.print("Enter k (k<sizeOfArray1) : ");
        int k = scanner.nextInt();

        int[] array_1 = generateArray(sizeArray_1);
        for (int i : array_1) {
            System.out.print(i + "\t");
        }
        System.out.println();
        int[] array_2 = generateArray(sizeArray_2);
        for (int i : array_2) {
            System.out.print(i + "\t");
        }
        System.out.println();
        int[] array_12 = new int[array_1.length + array_2.length];

        for (int i = 0; i < array_12.length; i++) {
            if (i <= k) {
                array_12[i] = array_1[i];
            } else if( i > k && i <= k + array_2.length) {
                array_12[i] = array_2[i-k-1];
            } else {
               array_12[i] = array_1[i-array_2.length];
            }
        }

        for (int i : array_12) {
            System.out.print(i + "\t");
        }
    }

    static int[] generateArray(int sizeArray) {
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
