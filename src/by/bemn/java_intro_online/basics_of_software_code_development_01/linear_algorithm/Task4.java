package by.bemn.java_intro_online.basics_of_software_code_development_01.linear_algorithm;

import java.util.Scanner;

// Дано действительное число R вида nnn.ddd (три цифры разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter double number (nnn.ddd): ");
        double input = scanner.nextDouble();

        int nnn = (int) input;
        int ddd = (int)((input - nnn) * 1000);
        double revers = ddd + nnn/1000d;

        System.out.println(revers);
    }
}
