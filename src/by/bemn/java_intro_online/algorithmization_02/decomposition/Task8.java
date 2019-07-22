package by.bemn.java_intro_online.algorithmization_02.decomposition;

// Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
// Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
// массива с номерами от k до m.

public class Task8 {
    public static void main(String[] args) {
        int[] array = {1, 9, 8, 1,11, 2, 45, -6, 9, 8, 0, -7, 3};

        print(array);

        int k = 2;
        int p = 4;

        int sum = sumElementsArray(array, k, p);

        System.out.println("\nsum = " + sum);
    }

    private static int sumElementsArray(int[] array, int k, int p) {
        int sum = 0;
        int countElementForSum = 0;

        for (int i = k; i < array.length && i<=p && countElementForSum < 3; i++) {
            sum = sum + array[i];
            countElementForSum++;
        }
        return sum;
    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + "\t");
        }
    }
}
