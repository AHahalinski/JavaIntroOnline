package by.bemn.java_intro_online.string_and_basics_of_text_processing_03.string_array_of_char;

import java.util.Scanner;

// Замените в строке все вхождения 'word' на 'letter'.

public class Task2 {
    public static void main(String[] args) {
        String strInput = initializationString();

        String newString = replaceWords(strInput, "word", "letter");

        System.out.println("\n" + newString);
    }

    private static String replaceWords(String strInput, String word1, String word2) {
        char[] charsStrInput = strInput.toCharArray();
        char[] charsWord = word1.toCharArray();
        char[] charsLetter = word2.toCharArray();

        int[] indexBeginCharsWord = findIndexBeginWord(charsStrInput, charsWord);

        int count = indexBeginCharsWord.length;

        System.out.println("count : " + count);

        char[] arrayAfterReplace = new char[charsStrInput.length + count * (charsLetter.length - charsWord.length)];

        int indexArrayOfIndex = 0;
        int indexArrayIn = 0;

        for (int i = 0; i < arrayAfterReplace.length; i++) {

            if (indexArrayOfIndex < count && i - indexArrayOfIndex*(charsLetter.length - charsWord.length) == indexBeginCharsWord[indexArrayOfIndex]) {
                indexArrayOfIndex++;

                for (int j = 0; j < charsLetter.length; j++) {
                    arrayAfterReplace[i++] = charsLetter[j];
                }

                i --;
                indexArrayIn = indexArrayIn + charsWord.length;

            } else {
                arrayAfterReplace[i] = charsStrInput[indexArrayIn++];
            }
        }

        return new String(arrayAfterReplace);
    }

    private static int[] findIndexBeginWord(char[] charsStrInput, char[] charsWord) {
        int count = 0;

// счетчик проходов: 1-ый проход - определение количества вхождений слова в исходную строку
//                   2-ой проход - запись индексов начала вхождения слова в исходную строку
        int loops = 0;

        int[] index = null;
        int iForArrayIndex = 0;

        do {
            loops++;

            if (loops == 2) {
                index = new int[count];
            }

            for (int i = 0; i <= charsStrInput.length - charsWord.length; i++) {
                char[] tempForChange = new char[charsWord.length];
                int k = 0;

                for (int j = i; j < charsWord.length + i; j++) {
                    tempForChange[k++] = charsStrInput[j];
                }
                if (equalsCharArray(tempForChange, charsWord)) {
                    if (loops == 1) {
                        count++;
                    } else {
                        index[iForArrayIndex++] = i;
                    }
                }
            }

        } while (loops < 2);

        return index;
    }

    private static boolean equalsCharArray(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }
        }

        return true;
    }

    private static String initializationString() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string : ");
        String stringIn = scanner.nextLine();
        return stringIn;
    }
}
