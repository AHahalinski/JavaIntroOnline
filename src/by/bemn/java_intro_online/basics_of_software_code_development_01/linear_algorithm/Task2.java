package by.bemn.java_intro_online.basics_of_software_code_development_01.linear_algorithm;

import java.util.Scanner;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (b + sqrt(b^2 + 4 * a * c) / (2 * a) - a ^3 * c + b^(-2)

// !!!!
// Для проверки вводить вещественные числа, используя ",", а не "."
// При использовании nextDouble() при использовании "." будет ошибка! (можно считывать строку и парсить для решения этой проблемы)

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 'a' = ");
        double a = scanner.nextDouble();

        System.out.print("Enter number 'b' = ");
        double b = scanner.nextDouble();

        System.out.print("Enter number 'c' = ");
        double c = scanner.nextDouble();

        double z = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("result z = " + z);
    }
}
