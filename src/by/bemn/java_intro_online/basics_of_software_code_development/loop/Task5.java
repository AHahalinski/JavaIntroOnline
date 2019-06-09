package by.bemn.java_intro_online.basics_of_software_code_development.loop;

import java.util.Scanner;

// Даны числовой ряд и некоторое число е.
// Найт и сумму тех членов ряда, модуль которых больше или равен заданному е.
// Общий член ряда имеет вид: An = 1/2^n+1/3^n

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = scanner.nextInt();

        System.out.print("Enter e : ");
        double e = scanner.nextDouble();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double an = 1 / (i * i) + 1 / (i * i * i);

            if (Math.abs(an) >= e) {
                sum += an;
            }
        }

        System.out.println("Result : " + sum);
    }
}
