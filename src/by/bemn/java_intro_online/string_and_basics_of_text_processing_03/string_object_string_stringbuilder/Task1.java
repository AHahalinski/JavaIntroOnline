package by.bemn.java_intro_online.string_and_basics_of_text_processing_03.string_object_string_stringbuilder;

import java.util.Scanner;

// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Task1 {
    public static void main(String[] args) {
        String strIn = initializationString();

        int maxCountSpace = findMaxCountSpace(strIn);

        System.out.println(maxCountSpace);
    }

    private static int findMaxCountSpace(String str) {
        int maxCount = 0;
        boolean isSpace = false;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            }
        }

        if (count > maxCount) { // если строка в конце имеет пробелы
            maxCount = count;
        }

        return maxCount;
    }

    private static String initializationString() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string : ");
        String stringIn = scanner.nextLine();
        return stringIn;
    }
}
