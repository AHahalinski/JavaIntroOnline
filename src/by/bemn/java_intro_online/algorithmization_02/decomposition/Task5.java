package by.bemn.java_intro_online.algorithmization_02.decomposition;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int capacity = initializationNumber();

        int[] array = generateArray(capacity);
        print(array);

        sortSelection(array);

        int element2th = selection2element(array);

        System.out.println("\n\n element = " + element2th);
    }

    private static int selection2element(int[] array) {
        int element = array[1];
        for (int i = 1; i < array.length-1; i++) {
            if (array[0] > array[i] && array[i] >= array[i+1]) {
                element = array[i];
                break;
            }
        }
        return element;
    }

    private static int initializationNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter capacity : ");
        while (!scanner.hasNextInt()) {
            System.out.print("Enter capacity : ");
            scanner.next();
        }
        int number = scanner.nextInt();
        return number;
    }

    private static int[] generateArray(int sizeArray) {
        int[] array = new int[sizeArray];
        array[0] = (int) (Math.random() * 100);
        for (int i = 1; i < sizeArray; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
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

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + "\t");
        }
    }
}
