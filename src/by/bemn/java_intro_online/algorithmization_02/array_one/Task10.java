package by.bemn.java_intro_online.algorithmization_02.array_one;

import java.util.Scanner;

// Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
// элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter capacity n = ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 100 - 50));
            System.out.print(array[i] + "; ");
        }

        int k = 1;
        for (int i = 2; i < array.length; i=i+2) {
                array[k] = array[i];
                array[i] = 0;
                k ++;
        }

        for (int i = k; i < array.length; i++) {
            array[i] = 0;
        }


        System.out.println("\nResult array:");
        for (int i : array) {
            System.out.print(i + "; ");
        }


    }
}
