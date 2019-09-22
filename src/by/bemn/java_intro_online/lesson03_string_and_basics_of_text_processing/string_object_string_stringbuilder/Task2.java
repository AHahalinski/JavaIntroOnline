package by.bemn.java_intro_online.lesson03_string_and_basics_of_text_processing.string_object_string_stringbuilder;

import java.util.Scanner;

// В строке вставить после каждого символа 'a' символ 'b'.

public class Task2 {
    public static void main(String[] args) {
        String strIn = initializationString();

        String strWithInserts = insertChar(strIn);

        System.out.println("Result string: " + strWithInserts);
    }

    private static String insertChar(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)== 'a') {
                stringBuilder.append(str.charAt(i)).append('b');
            } else {
                stringBuilder.append(str.charAt(i));
            }
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
