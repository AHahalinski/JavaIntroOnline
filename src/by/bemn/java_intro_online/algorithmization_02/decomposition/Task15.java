package by.bemn.java_intro_online.algorithmization_02.decomposition;

import java.util.Scanner;

// Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
// последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class Task15 {
    public static void main(String[] args) {
        int countDigit = initializationNumber("countDigit");
        findAndPrintNumber(countDigit);
    }

    private static void findAndPrintNumber(int countDigit) {

        for (int i = 1; i <= 9; i++) {
            int tempCount = 0;
            for (int j = i; i+countDigit <= 10 && tempCount < countDigit; j++) {
                System.out.print(j);
                tempCount++;
            }

            if(tempCount <= countDigit) {

            }
            System.out.println();
        }
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
