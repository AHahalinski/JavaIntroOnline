package by.bemn.java_intro_online.lesson06_tasks.task1.controller.catalog;

import by.bemn.java_intro_online.lesson06_tasks.task1.entity.book.Book;
import by.bemn.java_intro_online.lesson06_tasks.task1.entity.user.User;

import java.util.List;

public interface Catalog {

    String show();
    User getClient();
    void setClient(User user);
    List<User> getUsers();
    List<Book> searchBook();
    void setBooks(List<Book> books);
    void setUser(List<User> users);

    boolean authorization(String login, String password);

    void initialisation();
}
