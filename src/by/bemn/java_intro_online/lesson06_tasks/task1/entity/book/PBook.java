package by.bemn.java_intro_online.lesson06_tasks.task1.entity.book;

public class PBook extends Book {
    private boolean isHardCover;

    public PBook(long id, BookType type, String name, String author, int year, String publishingHouse, int pages, boolean isHardCover) {
        super(id, type, name, author, year, publishingHouse, pages);
        this.isHardCover = isHardCover;
    }

}
