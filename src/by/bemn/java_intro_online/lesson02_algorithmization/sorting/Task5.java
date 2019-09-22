package by.bemn.java_intro_online.lesson02_algorithmization.sorting;

import java.util.Scanner;

// Сортировка вставками. Дана последовательность чисел a1,a2,...,an . Требуется переставить числа в порядке
// возрастания. Делается это следующим образом. Пусть a1,a2,,ai - упорядоченная последовательность, т. е.
// a1 ... a2 ... an . Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
// последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
// не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
// с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array  N : ");
        while(!scanner.hasNextInt()){
            System.out.print("Enter size of array  N : ");
            scanner.next();
        }
        int sizeArray = scanner.nextInt();

        int[] array = generateArray(sizeArray);

//        int[] array = {7, 3, 1, 5, 2, 4};
//        int[] array = {27, -45, -5, -45, -47, 44, 35, -13, 2, -2};
//        int[] array = {0, -5, -45, -13, 2, -2};


        System.out.print("Array before sorting [ ");
        print(array);
        System.out.println("]");

        sortInsert(array);

        System.out.print("Array after sorting  [ ");
        print(array);
        System.out.println("]");
    }

    private static void sortInsert(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i + 1];

                int indexInsert = searchBin(array, temp, i);

                shift(array, i, indexInsert);

                array[indexInsert] = temp;
            }
        }
    }

    private static void shift(int[] array, int index, int indexInsert) {
        for (int i = index + 1; i > indexInsert; i--) {
            array[i] = array[i - 1];
        }
    }

    private static int searchBin(int[] array, int element, int indexEnd) {
        int indexBegin = 0;
        int indexMidl = indexEnd;
        int indexForInsert;

        while (indexEnd >= indexBegin) {
            indexMidl = (indexBegin + indexEnd) / 2;

            if (array[indexMidl] > element) {
                indexEnd = indexMidl - 1;

            } else if (array[indexMidl] < element) {
                indexBegin = indexMidl + 1;

            } else {
                break;
            }
        }

        indexForInsert = array[indexMidl] > element ? indexMidl : ++indexMidl;

        return indexForInsert;
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
