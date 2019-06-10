package by.bemn.java_intro_online.basics_of_software_code_development_01.loop;

import java.util.Scanner;

// Вычислить значение функции на отрезке [a, b] с шагом h:
//    | x, x > 2
// y <
//    | -x, x <= 2

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[a, b]");
        System.out.print("a = ");
        int a = scanner.nextInt();

        System.out.print("b = ");
        int b = scanner.nextInt();

        System.out.print("h = ");
        int h = scanner.nextInt();

        for (int i = a; i <= b; i = i + h) {
            int yx = 0;

            if (i <= 2) {
                yx = -i;
            } else {
                yx = i;
            }

            System.out.println(i + " : " + yx);
        }
    }
}
