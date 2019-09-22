package by.bemn.java_intro_online.lesson06_tasks.task1.entity.book;

public class EBook extends Book {
    private double size;
    private String format;

    public EBook(long id, BookType type, String name, String author, int year, String publishingHouse, int pages, double size, String format) {
        super(id, type, name, author, year, publishingHouse, pages);
        this.size = size;
        this.format = format;
    }

    @Override
    public String showInformation() {
        return super.showInformation()
                + String.format("%-6.2f\t%5s", size, format);
    }
}
