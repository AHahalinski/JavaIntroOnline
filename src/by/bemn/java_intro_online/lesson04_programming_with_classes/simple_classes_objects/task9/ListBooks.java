package by.bemn.java_intro_online.lesson04_programming_with_classes.simple_classes_objects.task9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListBooks {
    private Book[] books;

    public ListBooks(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public List<Book> getListBookByAuthor(String author) {
        if (author == null|| author.isEmpty() ){
              return Arrays.asList(books);
        } else {
            return Arrays.stream(books).filter(book -> (book.getAuthors()).toLowerCase().contains(author.toLowerCase())).collect(Collectors.toList());
        }
    }

    public List<Book> getListBookByPublishingHouse(String publishingHouse) {
        if(publishingHouse == null || publishingHouse.isEmpty() ){
            return Arrays.asList(books);
        } else {
            return Arrays.stream(books).filter(book -> book.getPublishingHouse().equalsIgnoreCase(publishingHouse)).collect(Collectors.toList());
        }
    }

    public List<Book> getListBookAfterYear(int year) {
        return Arrays.stream(books).filter(book -> book.getYear() > year).collect(Collectors.toList());
    }
}
