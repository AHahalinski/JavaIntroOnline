package by.bemn.java_intro_online.lesson01_basics_of_software_code_development.branch;

import java.util.Scanner;

// Даны три точки A(x1, y1), B(x2, y2), C(x3, y3).
// Определить, будут ли они расположены на одной прямой

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//         Point A(x1, y1)
        System.out.println("A(x1, y1) : ");
        System.out.print("x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("y1 = ");
        int y1 = scanner.nextInt();

//         Point B(x2, y2)
        System.out.println("B(x2, y2) : ");
        System.out.print("x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("y2 = ");
        int y2 = scanner.nextInt();

//        Point C(x3, y3)
        System.out.println("C(x3, y3) : ");
        System.out.print("x3 = ");
        int x3 = scanner.nextInt();
        System.out.print("y3 = ");
        int y3 = scanner.nextInt();

        if ((x3-x1)/(x2-x1) == (y3-y1)/(y2-y1)) {
            System.out.println("Belong to one line");
        } else {
            System.out.println("Don't belong to one line");
        }
    }
}
