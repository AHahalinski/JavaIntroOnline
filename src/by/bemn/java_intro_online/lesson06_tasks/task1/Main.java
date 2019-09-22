package by.bemn.java_intro_online.lesson06_tasks.task1;

import by.bemn.java_intro_online.lesson06_tasks.task1.controller.reader_writer_file.CryptographerDataUser;
import by.bemn.java_intro_online.lesson06_tasks.task1.view.Menu;

import java.io.*;

public class Main {
    private static final String FILE = "d://Home//java//file.txt";
    private static final String FILE_BOOKS = "d://Home//java//books.txt";
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.downloadCatalog();
        menu.run();

//        try ( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE))){
//            bufferedWriter.write(new String(CryptographerDataUser.encrypt(new String("oleg"))));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            FileInputStream fis = new FileInputStream(new BufferedReader(new FileReader(FILE)));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

    }
}
