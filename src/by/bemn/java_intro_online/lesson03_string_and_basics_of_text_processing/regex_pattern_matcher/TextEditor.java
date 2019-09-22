package by.bemn.java_intro_online.lesson03_string_and_basics_of_text_processing.regex_pattern_matcher;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
 * операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
 * а в случае равенства – по алфавиту.
 */

public class TextEditor {
    private static final String TEXT =
            "ШУ-ШНО должны использоваться в соответствии с их номинальными техническими характеристиками.\n" +
                    "ШУ-ШНО должны использоваться в условиях, соответствующих номи-нальным условиям воздействия климатических и механических факторов внеш-ней среды. Порядок работы устанавливается обслуживающим персоналом в зави-симости от специфики ШУ-ШНО и местных условий. При этом необходимо со-блюдать требования данного руководства по монтажу и эксплуатации, и тре-бования инструкций по монтажу и эксплуатации на комплектующую аппарату-ру.\n" +
                    "Эксплуатация должна производиться в соответствии с настоящим руко-водством, ТКП 181-2009 «Правилами технической эксплуатации электроуста-новок потребителей», «Правилами технической эксплуатации электрических станций и подстанций», «Межотраслевыми правилами по охране труда при работе в электроустановках», «Правилами техники безопасности при эксплуа-тации электроустановок ТКП 427-2012», «Правилами устройств электроуста-новок».К обслуживанию ШУ-ШНО допускается персонал, прошедший специ-альную подготовку по техническому использованию и безопасному обслужи-ванию электротехнических изделий напряжением до 1000 В.Персонал, обслуживающий ШУ-ШНО, должен быть ознакомлен с руко-водством по эксплуатации данного изделия, а также с эксплуатационной доку-ментацией на комплектующую аппаратуру, встроенную в щиты, знать устрой-ство и принцип работы ШУ-ШНО и комплектующей аппаратуры.";

    //        private static String TEXT =
//            "11, 111. 2 222! 3 3. 4444 44 4.\n" +
//                    "1111: 11 11. 12 12? 13 1313. 14, 141414 1414 14! 15 15.\n" +
//                    "21. 222222 222 22 2222 22222222.\n" +
//                    "333331 3131.";
    private static String text = new String(TEXT);
    private static char ch = ' ';

    private static boolean isExit = false;

    public static void main(String[] args) {
        System.out.println(text);

        do {
            printMenu();
            String command = enterCommand();
            doCommand(command);

            if (command.equals("0")) {
                isExit = true;
            }
        } while (!isExit);
    }

    /*
     * Вывод меню на консоль
     */
    private static void printMenu() {
        System.out.println("**************************************************" +
                "\nМеню:");
        System.out.print("1. отсортировать абзацы по количеству предложений;\n" +
                "2. в каждом предложении отсортировать слова по длине;\n" +
                "3. отсортировать лексемы в предложении\n" +
                "   по убыванию количества вхождений заданного символа;\n" +
                "4. показать исходный текст;\n" +
                "0. выход из программы.\n");
        System.out.println("**************************************************\n");
        System.out.print("Выберете пункт меню: ");
    }

    /*
     *   Ввод команды с консоли
     */
    private static String enterCommand() {
        Scanner scanner = new Scanner(System.in);
        String strEnter = "";
        do {
            strEnter = scanner.nextLine();
            if (strEnter.matches("[0-4]")) {
                return strEnter;
            } else {
                System.out.print("Такой команды нет! Повторите ввод: ");
                printMenu();
            }
        } while (true);
    }

    /*
     * Выполнение выбранного пункта меню
     */
    private static void doCommand(String command) {
        switch (command) {
            case "1":
                sortParagraph();
                System.out.println("\n" + text);
                break;
            case "2":
                sortWordInSentence();
                System.out.println("\n" + text);
                break;
            case "3":
                sortWordWithTokensInSentence();
                ch = ' ';
                System.out.println("\n" + text);
                break;
            case "4":
                text = TEXT;
                System.out.println("\n" + text);
                break;
            case "0":
                isExit = true;
        }
    }


    /*
     * Сортировка по количеству предложений в обзаце
     */
    private static void sortParagraph() {
        String[] paragraphs = text.split("\n");
        for (int i = 1; i < paragraphs.length; ) {
            int countMaxTemp = findSentence(paragraphs[i - 1]);
            int countSentence = findSentence(paragraphs[i]);
            if (countMaxTemp < countSentence) {
                String temp = paragraphs[i - 1];

                paragraphs[i - 1] = paragraphs[i];
                paragraphs[i] = temp;

                if (i != 1) {
                    i--;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < paragraphs.length; i++) {
            sb.append(paragraphs[i]).append("\n");
        }
        text = sb.toString();
    }

    /*
     * Подсчет предложенией в обзаце (строке)
     */
    private static int findSentence(String string) {
        String[] sentences = string.trim().split("[.!?\n]+");
        return sentences.length;
    }

    /*
     * Определение слов в предложении
     */
    private static String[] findWord(String string) {
        Pattern pattern = Pattern.compile("[\\p{Punct}\\s]+");
        return string.trim().split(pattern.toString());
    }

    /*
     * Подсчет букв в слове
     */
    private static int findLetters(String word) {
        int count = word.length();
        return count;
    }

    /*
     * Сортировка слов по количеству символов в слове
     * и формирование предложений
     */
    private static void sortWordInSentence() {
        StringBuilder result = new StringBuilder();
        Matcher matcher = Pattern.compile("([^.!?]+[.!?])").matcher(text);

        while (matcher.find()) {
            String sentence = matcher.group(1);
            String[] words = findWord(sentence);

            for (int i = 0; i < words.length; i++) {
                sentence = sentence.replaceFirst(words[i], String.valueOf(i));
            }

            String wordsAfterSorting[] = sortWordsLength(words);

            for (int i = 0; i < wordsAfterSorting.length; i++) {
                Pattern p = Pattern.compile("\\b" + String.valueOf(i) + "\\b");
                sentence = sentence.replaceFirst(p.toString(), wordsAfterSorting[i]);
            }
            result.append(sentence);
        }

        text = result.toString();
    }

    /*
     * Сортировка массива слов по количеству символов в слове
     */
    private static String[] sortWordsLength(String[] words) {
        for (int i = 1; i < words.length; ) {
            int countMaxTemp = findLetters(words[i - 1]);
            int countLetters = findLetters(words[i]);
            if (countMaxTemp < countLetters) {
                String temp = words[i - 1];

                words[i - 1] = words[i];
                words[i] = temp;

                if (i != 1) {
                    i--;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        return words;
    }

    /*
     * Сортировка слов по количеству вхождений заданного символа в слове
     * и формирование предложений
     */
    private static void sortWordWithTokensInSentence() {
        StringBuilder result = new StringBuilder();

        Matcher matcher = Pattern.compile("([^.!?]+[.!?])").matcher(text);

        while (matcher.find()) {
            String sentence = matcher.group(1);
            String[] words = findWord(sentence);

            for (int i = 0; i < words.length; i++) {
                sentence = sentence.replaceFirst(words[i], String.valueOf(i));
            }

            String wordsAfterSorting[] = sortWordsTokens(words);

            for (int i = 0; i < wordsAfterSorting.length; i++) {
                Pattern p = Pattern.compile("\\b" + String.valueOf(i) + "\\b");
                sentence = sentence.replaceFirst(p.toString(), wordsAfterSorting[i]);
            }
            result.append(sentence);
        }

        text = result.toString();
    }

    /*
     * Сортировка слов в предложении по числу вхождений символа
     */
    private static String[] sortWordsTokens(String[] words) {
        if (ch == ' ') {
            enterChar();
        }
        alphabet(words);

        for (int i = 1; i < words.length; ) {
            int countMaxTemp = findCountChar(words[i - 1], ch);
            int countLetters = findCountChar(words[i], ch);

            if (countMaxTemp < countLetters) {
                String temp = words[i - 1];
                words[i - 1] = words[i];
                words[i] = temp;

                if (i != 1) {
                    i--;
                } else {
                    i++;
                }
            } else {
                i++;
            }

        }
        return words;
    }

    /*
     * Сортировка слов по алфавиту
     */
    private static void alphabet(String[] word) {
        Collections.sort(Arrays.asList(word));
    }

    /*
     * Подсчет количества вхождений символа в слово
     */
    private static int findCountChar(String word, char ch) {
        return (int) word.chars().filter(c -> c == ch).count();
    }


    /*
     * Ввод символа для сортировки лексем
     */
    private static void enterChar() {
        Scanner scanner = new Scanner(System.in);
        String chEnter = "";
        System.out.print("Введите символ, по которому необходимо сотрировать слова: ");
        do {
            chEnter = scanner.nextLine();
            if (chEnter.length() == 1) {
                ch = chEnter.charAt(0);
                break;
            } else {
                System.out.print("Введите один символ: ");
            }
        } while (true);
    }
}
