package by.bemn.java_intro_online.basics_of_software_code_development_01.loop;

import java.util.Scanner;

// Для каждого натурального числа в промежутке от m до n вывести все делители,
// кроме единицы и самого числа. m и n вводятся с клавиатуры.

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[m, n]");
        System.out.println("Enter m : ");
        int m = scanner.nextInt();

        System.out.println("Enter n : ");
        int n = scanner.nextInt();

        for (int i = m; i <= n ; i++) {

            for (int j = 2; j < Math.abs(i); j++) {

                if (i % j == 0) {
                    System.out.println("For " + i + " : " + j);
                }

            }

        }
    }
}
