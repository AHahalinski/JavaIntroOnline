package by.bemn.java_intro_online.lesson03_string_and_basics_of_text_processing.string_array_of_char;

import java.util.Scanner;

//  Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class Task1 {
    public static void main(String[] args) {
        int capacityArray = 5;
        String[] arrayOfCamelCase = initializationArray("camelCase", capacityArray);

        String[] arraySnakeCase = convertCamelCaseToSnake(arrayOfCamelCase);

        print(arraySnakeCase);

    }

    private static void print(String[] arraySnakeCase) {
        for (String str : arraySnakeCase) {
            System.out.print(str + ";  ");
        }
    }

    private static String[] convertCamelCaseToSnake(String[] arrayOfCamelCase) {
        String[] arraySnakeCase = new String[arrayOfCamelCase.length];

        for (int i = 0; i < arrayOfCamelCase.length; i++) {
            char[] tempCharArray = convertValue(arrayOfCamelCase[i]);
            arraySnakeCase[i] = changeCamelToSnakeCase(tempCharArray);
        }

        return arraySnakeCase;
    }

    private static String changeCamelToSnakeCase(char[] array) {
        int countUpperCase = findAllUpperCase(array);
        char[] newArrayChar = new char[array.length + countUpperCase];

        int indexForNewArray = 0;

        for (int i = 0; i < array.length; i++) {

            if (Character.isUpperCase(array[i])) {

                if (i == 0) {
                    newArrayChar[indexForNewArray] = Character.toLowerCase(array[i]);
                } else {
                    newArrayChar[indexForNewArray++] = '_';
                    newArrayChar[indexForNewArray] = Character.toLowerCase(array[i]);
                }

            } else {
                newArrayChar[indexForNewArray] = array[i];
            }

            indexForNewArray++;
        }
        return new String(newArrayChar);
    }

    private static int findAllUpperCase(char[] array) {
        int count = 0;

        for (char ch : array) {

            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        return count;
    }

    private static char[] convertValue(String s) {
        return s.toCharArray();
    }

    private static String[] initializationArray(String nameVariable, int capacityArray) {
        String nameValue;
        String[] array = new String[capacityArray];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter element of array[%s] : ", i);
            array[i] = scanner.nextLine();
        }

        return array;
    }
}
