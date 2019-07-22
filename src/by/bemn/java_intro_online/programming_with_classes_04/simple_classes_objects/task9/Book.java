package by.bemn.java_intro_online.programming_with_classes_04.simple_classes_objects.task9;

/*
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 *       a) список книг заданного автора;
 *       b) список книг, выпущенных заданным издательством;
 *       c) список книг, выпущенных после заданного год
 */

public class Book {
    private long id;
    private String name;
    private String authors;
    private String publishingHouse;
    private int year;
    private int countPages;
    private double price;
    private boolean isHardcover;

    public Book(
            long id,
            String name,
            String authors,
            String publishingHouse,
            int year,
            int countPages,
            double price,
            boolean isHardcover
    ) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.countPages = countPages;
        this.price = price;
        this.isHardcover = isHardcover;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    public boolean isHardcover() {
        return isHardcover;
    }

    public void setHardcover(boolean hardcover) {
        isHardcover = hardcover;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Book id #%d\t\"%s\"\t%s\t%s\t%d\t%d pages\tcover book: %s\t%s p.",
                id, name, authors, publishingHouse, year, getCountPages(), (isHardcover ? "hard" : "soft"), price);
    }
}
