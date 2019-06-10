package by.bemn.java_intro_online.basics_of_software_code_development_01.linear_algorithm;

import java.util.Scanner;

import static java.lang.Math.*;

// Вычислить значение выажения по формуле (все переменные принимают действительные значения):
// (sin(x) + cos(y))/(cos(x) - sin(y)) * tg(x*y)

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angel in DEG 'x' = ");
        double x = scanner.nextDouble();

        System.out.print("Enter angel in DEG 'y' = ");
        double y = scanner.nextDouble();

        double z =((sin(x * PI / 180) + cos(y * PI / 180)) / (cos(x * PI / 180) - sin(y * PI / 180))) * tan(y*x*PI/180);
        System.out.println("(sin(x) + cos(y))/(cos(x) - sin(y)) * tg(x*y) = " + z);
    }
}
