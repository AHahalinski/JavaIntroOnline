package by.bemn.java_intro_online.string_and_basics_of_text_processing_03.string_array_of_char;

import java.util.Scanner;

// Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить.

public class Task5 {
    public static void main(String[] args) {
        String strIn = initializationString();

        String strOut = deleteSpace(strIn);

        System.out.println(strOut);
        System.out.println(strOut.length());
    }

    private static String deleteSpace(String str) {
        char[] arrayChars = str.toCharArray();
        char[] temp = new char[arrayChars.length]; // временный массив
        int countIndexArrayOut = arrayChars.length; // количество элементов итогового массива
        int indexForTempArray = 0;

        for (int i = 0; i < arrayChars.length; i++) {

            if(arrayChars[i] == ' ') {
                countIndexArrayOut --;
            }

            if (arrayChars[i] != ' ' && indexForTempArray == 0) {
                temp[indexForTempArray++] = arrayChars[i];
            } else {

                if (i < arrayChars.length-1 && indexForTempArray > 0 && arrayChars[i] == ' ' && arrayChars[i + 1] != ' ') {
                    temp[indexForTempArray++] = ' ';
                    temp[indexForTempArray++] = arrayChars[i + 1];
                    countIndexArrayOut++;
                    i++;
                } else if(arrayChars[i] != ' '){
                    temp[indexForTempArray++] = arrayChars[i];
                }
            }
        }

        char[] arrayOut = new char[countIndexArrayOut]; // массив для символов без лишних пробелов и элементов (равных '')

        for (int i = 0; i < arrayOut.length; i++) {
            arrayOut[i] = temp[i];
        }

        return new String(arrayOut);
    }

    private static String initializationString() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string : ");
        String stringIn = scanner.nextLine();
        return stringIn;
    }
}
