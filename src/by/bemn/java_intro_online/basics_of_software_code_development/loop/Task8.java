package by.bemn.java_intro_online.basics_of_software_code_development.loop;

import java.util.Scanner;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 number : ");
        long num1 = scanner.nextLong();
        String stringOfNum1 = String.valueOf(num1);

        System.out.print("Enter 1 number : ");
        int num2 = scanner.nextInt();
        String stringOfNum2 = String.valueOf(num2);

        String temp = "";
        for (int i = 0; i < stringOfNum1.length(); i++) {
            String stringWithChar = String.valueOf(stringOfNum1.charAt(i));
            if (stringOfNum2.contains(stringWithChar) && !temp.contains(stringWithChar)) {
                System.out.println(stringOfNum1.charAt(i));
                temp += stringWithChar;
            }
        }
    }
}
