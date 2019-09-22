package by.bemn.java_intro_online.lesson03_string_and_basics_of_text_processing.string_object_string_stringbuilder;

import java.util.Scanner;

// Проверить, является ли заданное слово палиндромом.

public class Task3 {
    public static void main(String[] args) {
        String strIn = initializationString();

        boolean isPalindrome = cheсkIsPalindrome(strIn);

        System.out.printf("Is string '%s' palindrome? - %s", strIn, isPalindrome);
    }

    private static boolean cheсkIsPalindrome(String strIn) {
        StringBuilder stringBuilder = new StringBuilder(strIn);

        if (strIn.equals(stringBuilder.reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }

    private static String initializationString() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string : ");
        String stringIn = scanner.nextLine();
        return stringIn;
    }
}
