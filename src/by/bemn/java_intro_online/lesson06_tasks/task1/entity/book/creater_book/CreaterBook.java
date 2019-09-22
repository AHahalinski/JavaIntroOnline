package by.bemn.java_intro_online.lesson06_tasks.task1.entity.book.creater_book;

import by.bemn.java_intro_online.lesson06_tasks.task1.entity.book.Book;
import by.bemn.java_intro_online.lesson06_tasks.task1.entity.book.BookType;
import by.bemn.java_intro_online.lesson06_tasks.task1.entity.book.EBook;
import by.bemn.java_intro_online.lesson06_tasks.task1.entity.book.PBook;

public class CreaterBook {
    public static Book create(String string) {
        String[] dataBook = string.split("\t");
        BookType type = BookType.valueOf(dataBook[1]);

        switch (type) {
            case PAPER:
                return new PBook(Integer.parseInt(dataBook[0]),
                        type,
                        dataBook[2],
                        dataBook[3],
                        Integer.parseInt(dataBook[4]),
                        dataBook[5],
                        Integer.parseInt(dataBook[6]),
                        dataBook[7].equals(true) ? true : false);

            case EBOOK:
                return new EBook(Integer.parseInt(dataBook[0]),
                        type,
                        dataBook[2],
                        dataBook[3],
                        Integer.parseInt(dataBook[4]),
                        dataBook[5],
                        Integer.parseInt(dataBook[6]),
                        Double.parseDouble(dataBook[7]),
                        dataBook[8]);
        }
        return null;
    }
}
