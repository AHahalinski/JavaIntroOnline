package by.bemn.java_intro_online.algorithmization_02.array_one;

import java.util.Scanner;

// Даны целые числа а1 ,а2 ,..., аn .
// Вывести на печать только те числа, для которых аi > i.

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter capacity array N : ");
        int n = scanner.nextInt();

        int[] array = new int[n];


        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 2 * n - n);

//  For check
//            System.out.print(array[i] + "; ");

        }

//        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.println(array[i]);
            }
        }

    }
}
