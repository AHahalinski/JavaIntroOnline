package by.bemn.java_intro_online.lesson01_basics_of_software_code_development.loop;

import java.math.BigInteger;
import java.util.Scanner;

// Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberIn = 0;

        while (numberIn <= 0) {
            System.out.println("Enter integer number N: ");
            String strTemp = scanner.nextLine();
            if (strTemp.matches("[1-9]+")) {
                numberIn = Integer.parseInt(strTemp);
            } else {
                System.out.println("try again!");
            }
        }

        BigInteger sum = new BigInteger("0");
        for (int i = 1; i <= numberIn; i++) {
            sum = sum.add(BigInteger.valueOf(i));
        }

        System.out.println("Sum 1..."+ numberIn + " : " + sum);
    }
}
