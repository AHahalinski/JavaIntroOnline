package by.bemn.java_intro_online.lesson01_basics_of_software_code_development.linear_algorithm;

import java.util.Scanner;

// Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
// принадлежит закрашенной области, и false - в противном случае.

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter point coordinates: ");
        System.out.print("х = ");
        int x = scanner.nextInt();

        System.out.print("y = ");
        int y = scanner.nextInt();

        if (y >= 0 && y <= 4 && x >= -2 && x <= 2) {
            System.out.println(true);
        } else if (y<= 0 && y >= -3 && x >= -4 && x <= 4) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
