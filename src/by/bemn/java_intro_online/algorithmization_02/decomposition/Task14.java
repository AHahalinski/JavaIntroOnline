package by.bemn.java_intro_online.algorithmization_02.decomposition;

import java.util.Scanner;

// Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
// возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
// использовать декомпозицию.

// 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54 748, 92 727, 93 084, 548 834, 1 741 725....

public class Task14 {
    public static void main(String[] args) {
        int number = initializationNumber("number");
        findAndPrintNumberArmstrong(number);
    }

    private static void findAndPrintNumberArmstrong(int number) {
        for (int i = 1; i < number; i++) {
            if (i == sumDigitNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static int sumDigitNumber(int numberForSum) {
        int sum = 0;
        int countDigit = 1 + (int)Math.floor(Math.log10(numberForSum));
        do {
            sum =  sum + (int)Math.pow((numberForSum % 10), countDigit);
            numberForSum = numberForSum /10;

        }while(numberForSum != 0);
        return sum;
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
