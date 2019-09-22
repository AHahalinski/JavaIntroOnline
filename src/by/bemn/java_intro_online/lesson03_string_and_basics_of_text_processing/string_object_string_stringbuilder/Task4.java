package by.bemn.java_intro_online.lesson03_string_and_basics_of_text_processing.string_object_string_stringbuilder;

// С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class Task4 {
    public static void main(String[] args) {
        String string = "информатика";
        String strForCheck = "торт";

        String resultStr = makeWord(string);

        if(strForCheck.equals(resultStr)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    private static String makeWord(String string) {

        String str = string.substring(7,8)
                .concat(string.substring(3,5))
                .concat(string.substring(7,8));

        return str;
    }
}
