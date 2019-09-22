package by.bemn.java_intro_online.lesson01_basics_of_software_code_development.linear_algorithm;

import java.util.Scanner;

// Найдите значение функции: z = ((a - 3) * b / 2 + c.

// !!!!
// Для проверки вводить вещественные числа, используя ",", а не "."
// При использовании nextDouble() при использовании "." будет ошибка! (можно считывать строку и парсить для решения этой проблемы)

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 'a' = ");
        double a = scanner.nextDouble();

        System.out.print("Enter number 'b' = ");
        double b = scanner.nextDouble();

        System.out.print("Enter number 'c' = ");
        double c = scanner.nextDouble();

        double z = ((a - 3) * b / 2) + c;
        System.out.println("((a - 3) * b / 2 + c = " + z);
    }
}
