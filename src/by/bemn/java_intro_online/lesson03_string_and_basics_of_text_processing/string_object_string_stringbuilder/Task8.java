package by.bemn.java_intro_online.lesson03_string_and_basics_of_text_processing.string_object_string_stringbuilder;

import java.util.Scanner;

// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.

public class Task8 {
    public static void main(String[] args) {
        String string = initializationString();

        String theLongestWord = findTheLongestWord(string);

        System.out.println("The longest word in the sentence is \"" + theLongestWord + "\"");
    }

    private static String findTheLongestWord(String string) {
        String[] strings = string.split(" ");

        int maxLength = 0;
        String tempWord = "";

        for(String str : strings) {

            if (maxLength < str.length()) {
                maxLength = str.length();
                tempWord = str;
            }
        }

        return tempWord;
    }

    private static String initializationString() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string : ");
        String stringIn = scanner.nextLine();
        return stringIn;
    }
}
