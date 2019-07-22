package by.bemn.java_intro_online.algorithmization_02.decomposition;

import java.util.Scanner;

// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task2 {
    public static void main(String[] args) {
        int number_1 = initializationNumber("number_1");
        int number_2 = initializationNumber("number_2");
        int number_3 = initializationNumber("number_3");
        int number_4 = initializationNumber("number_4");

        int gcd = greatestCommonDivisor(greatestCommonDivisor(number_1,number_2),greatestCommonDivisor(number_3,number_4));
        System.out.printf("GCD(%s, %s, %s, %s) = %s", number_1, number_2, number_3, number_4, gcd);
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

    private static int greatestCommonDivisor(int number_a, int number_b) {
        int gcd = 1;
        for (int i = 1; i <= (number_a < number_b ? number_a : number_b); i++) {
            if (number_a % i == 0 && number_b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

}
