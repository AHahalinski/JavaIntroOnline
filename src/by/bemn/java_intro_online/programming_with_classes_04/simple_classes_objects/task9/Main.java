package by.bemn.java_intro_online.programming_with_classes_04.simple_classes_objects.task9;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1, "В метре друг от друга", "Микки Дотри, Тобиас Иаконис, Рейчел Липпинкот",
                "Эксмо", 2019, 368, 17.33, true);
        Book book2 = new Book(3, "Мятная сказка", "Александр Полярный",
                "АСТ", 2018, 160, 17.33, true);
        Book book3 = new Book(10, "Искусство любить", "Эрих Фромм",
                "АСТ", 2016, 224, 7.90, false);
        Book book4 = new Book(2, "Букварь", "Надежда Жукова",
                "Эксмо", 2016, 96, 10.00, true);
        Book book5 = new Book(21, "Абиссаль", "Стейс Крамер",
                "АСТ", 2019, 576, 18.50, true);
        Book book6 = new Book(5, "Правила дорожного движения и меры ответственности за их нарушение",
                "",
                "Национальный центр правовой информации",
                2019, 160, 2.94, false);

        ListBooks listBooks = new ListBooks(
                new Book[]{book1,
                        book2,
                        book3,
                        book4,
                        book5,
                        book6}
        );

        List<Book> list1 = listBooks.getListBookAfterYear(2017);
        List<Book> list2 = listBooks.getListBookByAuthor("жукова");
        List<Book> list3 = listBooks.getListBookByPublishingHouse("аст");

        System.out.println("\n******** YEAR ********");
        list1.forEach(book -> System.out.println(book));

        System.out.println("\n******** AUTHORS ********");
        list2.forEach(book -> System.out.println(book));

        System.out.println("\n******** PUBLISHING HOUSE ********");
        list3.forEach(book -> System.out.println(book));
    }
}
