package by.bemn.java_intro_online.lesson03_string_and_basics_of_text_processing.string_array_of_char;

import java.util.Scanner;

// В строке найти количество цифр.

public class Task3 {
    public static void main(String[] args) {
        String srtInput = initializationString();

        int countDigit = findDigit(srtInput);

        System.out.println("\n" + countDigit);
    }

    private static int findDigit(String str) {
        char[] chars = str.toCharArray();

        int coutnDigit = 0;
        for(char ch : chars) {

            if (Character.isDigit(ch)) {
                coutnDigit++;
            }
        }

        return coutnDigit;
    }

    private static String initializationString() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string : ");
        String stringIn = scanner.nextLine();
        return stringIn;
    }
}
