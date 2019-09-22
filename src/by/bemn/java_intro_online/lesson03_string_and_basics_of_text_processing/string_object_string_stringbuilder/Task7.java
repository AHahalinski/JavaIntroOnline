package by.bemn.java_intro_online.lesson03_string_and_basics_of_text_processing.string_object_string_stringbuilder;

import java.util.Scanner;

// Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено
// "abc cde def", то должно быть выведено "abcdef".

public class Task7 {
    public static void main(String[] args) {
        String string = initializationString();

        String result = deleteDoubleCharsSpace(string);

        System.out.printf("New string is %s", result);
    }

    private static String deleteDoubleCharsSpace(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.trim());

        for (int i = 0; i < stringBuilder.length()-1; i++) {

            if(stringBuilder.charAt(i) == ' ') {
                stringBuilder.deleteCharAt(i);
                i--;
            }
        }

        String result = "";
        for (int i = 0; i < stringBuilder.length(); i++) {
            String temp = String.valueOf(stringBuilder.charAt(i));

            if(!result.contains(temp)){
                result = result.concat(temp);
            }
        }

        return result;
    }

    private static String initializationString() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string : ");
        String stringIn = scanner.nextLine();
        return stringIn;
    }
}
