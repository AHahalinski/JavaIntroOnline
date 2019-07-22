package by.bemn.java_intro_online.algorithmization_02.sorting;

import java.util.Scanner;

// Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
// Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . Если ai <= ai+1 , то продвигаются
// на один элемент вперед. Если ai > ai+1 , то производится перестановка и сдвигаются на один элемент назад.
// Составить алгоритм этой сортировки.

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array  N : ");
        while(!scanner.hasNextInt()){
            System.out.print("Enter size of array  N : ");
            scanner.next();
        }
        int sizeArray = scanner.nextInt();

        int[] array = generateArray(sizeArray);
//        int[] array = {-8,	16,	-7,	-48,	8};
//        int[] array = {-36, -48, 23, -52, -39, -4, 43, 35, 40, -13};

        System.out.print("Array before sorting  [ ");
        print(array);
        System.out.println("]");

        sortShell(array);

        System.out.print("Array after sorting  [ ");
        print(array);
        System.out.println("]");
    }

    private static void sortShell(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1;) {
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;

                if (i > 0) {
                    i = i - 1;
                }
            } else {
                i++;
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
