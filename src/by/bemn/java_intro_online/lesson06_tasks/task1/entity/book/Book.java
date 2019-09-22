package by.bemn.java_intro_online.lesson06_tasks.task1.entity.book;

public abstract class Book {
    protected long id;
    protected String type;
    protected String name;
    protected String author;
    protected int year;
    protected String publishingHouse;
    protected int pages;

    protected Book(long id, BookType type, String name, String author, int year, String publishingHouse, int pages) {
        this.id = id;
        this.type = type.toString();
        this.name = name;
        this.author = author;
        this.year = year;
        this.publishingHouse = publishingHouse;
        this.pages = pages;
    }

    public String showInformation() {
        return String.format("id: %-4d\ttype: %-10s\t'%-20s'\t%-20s\t%-8d\t%-20s\t%-8d",
                id, type, name, author, year, publishingHouse, pages);
    }
}
