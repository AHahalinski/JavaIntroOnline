package by.bemn.java_intro_online.basics_of_software_code_development_01.linear_algorithm;

import java.util.Scanner;

// Дано действительное число R вида nnn.ddd (три цифры разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter double number (nnn.ddd): ");
            String input = scanner.nextLine();

            if (input.matches("^[0-9]{3}[.|,][0-9]{3}$")) {
                String[] strings = input.split("[.,]");
                System.out.println(strings[1] + "." + strings[0]);
                break;
            } else {
                System.out.println("Incorrect data, try again");
            }
        }
    }
}
