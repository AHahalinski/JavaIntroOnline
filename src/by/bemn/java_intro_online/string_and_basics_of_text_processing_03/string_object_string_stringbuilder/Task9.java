package by.bemn.java_intro_online.string_and_basics_of_text_processing_03.string_object_string_stringbuilder;

import java.util.Scanner;

// Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
// Учитывать только английские буквы.

public class Task9 {
    public static void main(String[] args) {
        String string = initializationString();

        findLowerAndUpperCase(string);
    }

    private static void findLowerAndUpperCase(String string) {
        int countLowerCase = 0;
        int countUpperCase = 0;

        for (int i = 0; i < string.length(); i++) {

            if((int)string.charAt(i) >= 65 && (int)string.charAt(i) <= 90) {
                countUpperCase++;
            }

            if((int)string.charAt(i) >= 97 && (int)string.charAt(i) <= 122) {
                countLowerCase++;
            }
        }

        System.out.printf("\nLower case : %s \nUpper case : %s", countLowerCase, countUpperCase);
    }

    private static String initializationString() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string : ");
        String stringIn = scanner.nextLine();
        return stringIn;
    }
}
