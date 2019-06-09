package by.bemn.java_intro_online.basics_of_software_code_development.branch;

import java.util.Scanner;

// Найти max{min(a, b), min(c, d)}

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a = ");
        int a = scanner.nextInt();

        System.out.print("Enter b = ");
        int b = scanner.nextInt();

        System.out.print("Enter c = ");
        int c = scanner.nextInt();

        System.out.print("Enter d = ");
        int d = scanner.nextInt();

        int minAB = a < b ? a : b;
        int minCD = c < d ? c : d;
        System.out.println("max{min(a, b), min(c, d)} = " + (minAB > minCD ? minAB : minCD));
    }
}
