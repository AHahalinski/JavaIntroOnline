package by.bemn.java_intro_online.lesson03_string_and_basics_of_text_processing.string_array_of_char;

import java.util.Scanner;

// В строке найти количество чисел.

public class Task4 {
    public static void main(String[] args) {
        String srtInput = initializationString();

        int countNumbers = findNumber(srtInput);

        System.out.println("\n" + countNumbers);
    }

    private static int findNumber(String str) {
        char[] chars = str.toCharArray();

        int coutnNumber = 0;
        boolean isNumber = false;

        for(char ch : chars) {

            if (Character.isDigit(ch)) {
                if(!isNumber) {
                    coutnNumber++;
                    isNumber = true;
                }
            } else {
                isNumber = false;
            }
        }

        return coutnNumber;
    }

    private static String initializationString() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string : ");
        String stringIn = scanner.nextLine();
        return stringIn;
    }
}
