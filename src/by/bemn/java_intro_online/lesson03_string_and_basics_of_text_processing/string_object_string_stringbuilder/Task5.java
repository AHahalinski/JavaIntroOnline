package by.bemn.java_intro_online.lesson03_string_and_basics_of_text_processing.string_object_string_stringbuilder;

import java.util.Scanner;

//  Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Task5 {
    public static void main(String[] args) {
        String string = initializationString();
        char ch = 'a';

        int countChar = findAndCountChar(string,ch);

        System.out.printf("count char %s : %s", ch, countChar);
    }

    private static int findAndCountChar(String string, char ch) {
        int count = 0;

        for (int i = 0; i < string.length(); i++) {

            if(string.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    private static String initializationString() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string : ");
        String stringIn = scanner.nextLine();
        return stringIn;
    }
}
