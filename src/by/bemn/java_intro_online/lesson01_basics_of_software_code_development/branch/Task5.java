package by.bemn.java_intro_online.lesson01_basics_of_software_code_development.branch;

import java.util.Scanner;

// Вычислить значение функции:
//      | x^2 - 3 x + 9
// F(x)<
//      | 1 / (x^3 + 6)
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x = ");
        double x = scanner.nextDouble();

        double fx;
        if (x > 3) {
            fx = 1 / (Math.pow(x, 3) + 6);
        } else {
            fx = x * x - 3 * x + 9;
        }

        System.out.println("Result F(x) = " + fx);
    }
}
