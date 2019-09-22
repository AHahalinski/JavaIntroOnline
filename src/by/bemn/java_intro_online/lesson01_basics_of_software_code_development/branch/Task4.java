package by.bemn.java_intro_online.lesson01_basics_of_software_code_development.branch;

import java.util.Scanner;

// Заданны размеры А, В прямоугольного отверстия и размеры x, y, z кирпича.
// Определить, пройдет ли кирпич через отвестия.

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A = ");
        int a = scanner.nextInt();

        System.out.print("B = ");
        int b = scanner.nextInt();

        System.out.print("x = ");
        int x = scanner.nextInt();

        System.out.print("y = ");
        int y = scanner.nextInt();

        System.out.print("z = ");
        int z = scanner.nextInt();
        if ((a >= x && (b >= y || b >= z))
                || (a >= y && (b >= x || b >= z))
                || (a >= z && (b >= x || b >= y))) {
            System.out.println("кирпич пройдет");
        } else {
            System.out.println("кирпич не пройдет");
        }
    }
}
