package by.bemn.java_intro_online.lesson06_tasks.task1.controller.reader_writer_file;

import by.bemn.java_intro_online.lesson06_tasks.task1.entity.user.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class WriterData {
    private static final String FILE_USERS = "d://Home//java//users1.txt";
    private static final String FILE_BOOKS = "d://Home//java//books.txt";

    public static void saveUserData(List<User> users) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(FILE_USERS))){
            users.forEach(user-> {
                String encoding = null;
                try {
                    encoding = new String(CryptographerDataUser.encrypt(user.toString()));
                    br.write(encoding);
                    br.newLine();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(encoding);


            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
