package by.bemn.java_intro_online.lesson02_algorithmization.array_one;

import java.util.Random;
import java.util.Scanner;

// В массив A [N] занесены натуральные числа.
// Найти сумму тех элементов, которые кратны данному К.

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter capacity array N : ");
        int n = scanner.nextInt();

        System.out.print("Enter K : ");
        int k = scanner.nextInt();

        int[] array = new int[n];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(k * 10);
        }

        long sunOfAllElementsArray = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sunOfAllElementsArray += array[i];
            }
        }

        System.out.println("Sum : " + sunOfAllElementsArray);
    }
}
