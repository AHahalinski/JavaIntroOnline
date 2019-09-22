package by.bemn.java_intro_online.lesson06_tasks.task1.controller.reader_writer_file;

import by.bemn.java_intro_online.lesson06_tasks.task1.entity.book.Book;
import by.bemn.java_intro_online.lesson06_tasks.task1.entity.book.creater_book.CreaterBook;
import by.bemn.java_intro_online.lesson06_tasks.task1.entity.user.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderData {
    private static final String FILE_USERS = "d://Home//java//users1.txt";
    private static final String FILE_BOOKS = "d://Home//java//books.txt";

    public static List<User> readerUsersData() {

        List<User> users = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        {
            try (BufferedReader br = new BufferedReader(new FileReader(FILE_USERS))) {
                while (br.ready()) {
                    String temp = br.readLine();
                    String[] dataUsers = temp.split("\t");
                    if (dataUsers.length == 4) {
                        users.add(new User(dataUsers[0], dataUsers[1], dataUsers[2], dataUsers[3].equals("true") ? true : false));
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return users;
    }


    public static List<User> readerUsersData1() {

        List<User> users = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_USERS))) {
            StringBuffer sb = new StringBuffer();
            while (br.ready()) {
                String str = br.readLine();
                String decodingData = CryptographerDataUser.decrypt(str);
                String[] dataUsers = decodingData.split("\t");
                if (dataUsers.length == 4) {
                    users.add(new User(dataUsers[0], dataUsers[1], dataUsers[2], dataUsers[3].equals("true") ? true : false));
                }


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return users;
    }

    public static List<Book> readerBooksData() {
        List<Book> books = new ArrayList<>();
        {
            try (BufferedReader br = new BufferedReader(new FileReader(FILE_BOOKS))) {
                while (br.ready()) {
                    String dataBook = br.readLine();
                    books.add(CreaterBook.create(dataBook));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return books;
    }

}
