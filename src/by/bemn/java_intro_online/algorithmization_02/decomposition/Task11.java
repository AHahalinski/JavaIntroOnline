package by.bemn.java_intro_online.algorithmization_02.decomposition;

import java.util.Scanner;

// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task11 {
    public static void main(String[] args) {
        int number_1 = initializationNumber("number_1");
        int number_2 = initializationNumber("number_2");

        String rezult = compareCountDigitalsInNumber(number_1, number_2);
        System.out.println(rezult);
    }

    private static String compareCountDigitalsInNumber(int number_1, int number_2) {
        int countDigitsNumber_1 = 1 + (int)Math.floor(Math.log10(number_1));
        int countDigitsNumber_2 = 1 + (int)Math.floor(Math.log10(number_2));

        if(countDigitsNumber_1 == countDigitsNumber_2) {
            return "Count of digitals in number_1 equals count of digitals in number_2";
        }

        if(countDigitsNumber_1 > countDigitsNumber_2) {
            return "Count of digitals in number_1 more then in number_2";
        } else {
            return "Count of digitals in number_2 more then in number_1";
        }

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
