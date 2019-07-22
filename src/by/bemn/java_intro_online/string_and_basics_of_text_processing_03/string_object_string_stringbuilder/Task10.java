package by.bemn.java_intro_online.string_and_basics_of_text_processing_03.string_object_string_stringbuilder;

import java.util.Scanner;

//  Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
// знаком. Определить количество предложений в строке X.

public class Task10 {
    public static void main(String[] args) {
        String text = initializationString();

        int countSentence = findSentence(text);

        System.out.println("There're " + countSentence + " sentence(s) in the text");
    }

    private static int findSentence(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == '.'
                    || text.charAt(i) == '!'
                    || text.charAt(i) == '?') {
                count++;
            }
        }

        return count;
    }

    private static String initializationString() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text : ");
        String stringIn = scanner.nextLine();
        return stringIn;
    }
}
