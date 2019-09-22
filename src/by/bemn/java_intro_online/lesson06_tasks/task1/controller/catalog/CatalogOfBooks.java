package by.bemn.java_intro_online.lesson06_tasks.task1.controller.catalog;

import by.bemn.java_intro_online.lesson06_tasks.task1.controller.reader_writer_file.ReaderData;
import by.bemn.java_intro_online.lesson06_tasks.task1.entity.book.Book;
import by.bemn.java_intro_online.lesson06_tasks.task1.entity.user.User;

import java.util.List;
import java.util.NoSuchElementException;

public class CatalogOfBooks implements Catalog {
    private List<Book> books;
    private List<User> users;
    private User currentClient;

    public CatalogOfBooks() {
        initialisation();
    }

    @Override
    public String show() {
        StringBuffer stringBuffer = new StringBuffer();
        books.forEach(book -> stringBuffer.append(book.showInformation()).append("\n"));
        return stringBuffer.toString();
    }

    @Override
    public User getClient() {
        return currentClient;
    }

    @Override
    public void setClient(User user) {
        currentClient = user;
    }

    @Override
    public List<Book> searchBook() {
        return null;
    }

    @Override
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public void setUser(List<User> users) {
        this.books = books;
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public boolean authorization(String login, String password) {
        User tempClient;
        try {
            tempClient = users.stream()
                    .filter(user -> user.getLogin().equals(login) && user.getPassword().equals(password))
                    .findFirst()
                    .get();
            currentClient = tempClient;
            return  true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    @Override
    public void initialisation() {
        users = ReaderData.readerUsersData1();      //////////
        books = ReaderData.readerBooksData();
    }
}
