package by.bemn.java_intro_online.algorithmization_02.decomposition;

import java.util.Scanner;

// Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
// натуральных чисел: НОК(А, В) = A*B/НОД(А, В)

public class Task1 {
    public static void main(String[] args) {
        int number_A = initializationNumber("A");
        int number_B = initializationNumber("B");

        int gcd = greatestCommonDivisor(number_A, number_B);

        int lcm = leastCommonMultiple(number_A, number_B, gcd);

        System.out.println("GDC(" + number_A + ", " + number_B + ") = " + gcd);
        System.out.println("LCM(" + number_A + ", " + number_B + ") = " + lcm);
    }

    private static int leastCommonMultiple(int number_a, int number_b, int gcd) {
        return number_a * number_b / gcd;
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

    private static int initializationNumber(String nameVariable) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number " + nameVariable + " : ");
        while (!scanner.hasNextInt()) {
            System.out.print("Enter number " + nameVariable + " : ");
            scanner.next();
        }
        int number = scanner.nextInt();
        return number;
    }


}
