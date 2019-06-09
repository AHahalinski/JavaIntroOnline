package by.bemn.java_intro_online.basics_of_software_code_development.linear_algorithm;

import java.util.Scanner;

// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секндах в следующей форме:
// ННч ММмин SSс.

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        long timeS = scanner.nextLong();

        long hours = timeS / 3600;
        int minutes = (int)(timeS - hours * 3600) / 60;
        int seconds = (int)timeS % 60;

        System.out.format("%dч %dмин %dс", hours, minutes, seconds);
    }
}

