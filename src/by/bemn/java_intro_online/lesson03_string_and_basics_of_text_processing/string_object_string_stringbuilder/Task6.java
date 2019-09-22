package by.bemn.java_intro_online.lesson03_string_and_basics_of_text_processing.string_object_string_stringbuilder;

import java.util.Scanner;

// Из заданной строки получить новую, повторив каждый символ дважды.

public class Task6 {
    public static void main(String[] args) {
        String str = initializationString();

        String newString = createNewStringDoubleChars(str);

        System.out.printf("String with double chars is \"%s\"", newString);
    }

    private static String createNewStringDoubleChars(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.charAt(i))
                    .append(str.charAt(i));
        }

        return stringBuilder.toString();
    }

    private static String initializationString() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string : ");
        String stringIn = scanner.nextLine();
        return stringIn;
    }
}
