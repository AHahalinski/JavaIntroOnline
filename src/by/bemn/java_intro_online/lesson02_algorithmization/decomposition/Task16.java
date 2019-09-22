package by.bemn.java_intro_online.lesson02_algorithmization.decomposition;

import java.util.Scanner;

// Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class Task16 {
    public static void main(String[] args) {
        int countDigit = initializationNumber("countDigit");

        long sum = findSumOddNumber(countDigit);
        System.out.println("Sum " + sum);

        int countEven = findCountEvenDigit(sum);
        System.out.println(countEven);
    }

    private static long findSumOddNumber(int countDigit) {
        long startNumber = (int) Math.pow(10, countDigit - 1);
        long sum = 0;

        for (long i = startNumber; i < startNumber * 10; i++) {

            if (isOnlyOddDigit(i)) {
                sum = sum + i;
            }
        }

        return sum;
    }

    private static boolean isOnlyOddDigit(long i) {
        do {

            if (i < 10) {

                if (i % 2 == 0) {
                    return false;
                } else {
                    i /= 10;
                }

            } else if ((i % 10) % 2 == 0) {
                return false;
            }
            i = i / 10;
        } while (i != 0);

        return true;
    }

    private static int findCountEvenDigit(long sum) {
        int count = 0;

        do {
            if ((sum % 10) % 2 == 0) {
                count++;
            }
            sum /= 10;
        } while (sum != 0);

        return count;
    }

    private static int initializationNumber(String nameVariable) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter " + nameVariable + " : ");
        while (!scanner.hasNextInt()) {
            System.out.print("Enter " + nameVariable + " : ");
            scanner.next();
        }
        int number = scanner.nextInt();
        return number;
    }
}
