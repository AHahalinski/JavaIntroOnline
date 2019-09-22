package by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task1;

/*
* Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
 * вывести на консоль текст, заголовок текста.
 */

public class Main {
    public static void main(String[] args) {
        Word word1 = new Word("Может");
        Word word2 = new Word("быть");
        Word word3 = new Word("введено");
        Word word4 = new Word("дополнительное");
        Word word5 = new Word("затухание");
        Word word6 = new Word("сигнала");
        Word word7 = new Word("с");
        Word word8 = new Word("помощью");
        Word word9 = new Word("аттенюатора.");

        Sentence[] title = new Sentence[]{new Sentence(word5)};

        Sentence sentence = new Sentence(word1, word2, word3, word4, word5, word6, word7, word8, word9);
        Sentence[] body = new Sentence[]{sentence};

        Text text = new Text(title, body);

        System.out.println(text);

        text.printBody();
        text.printTitle();

        text.addSentences(body);
        text.addSentences(body);
        text.addSentences(title);
        System.out.println(text);

    }
}
