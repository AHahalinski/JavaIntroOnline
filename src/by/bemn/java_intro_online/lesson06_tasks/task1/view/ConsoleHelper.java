package by.bemn.java_intro_online.lesson06_tasks.task1.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    public static String readString(){
        String stringIn = "";

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            stringIn = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringIn;
    }

    public static int readInteger() {
        int pointMenu = 0;

        String stringIn = null;
        try {
            stringIn = readString();
            pointMenu = Integer.parseInt(stringIn);
        } catch (Exception e) {
            pointMenu = 0;
        }

        return pointMenu;
    }

    public static void print(String str) {
        System.out.println(str);
    }
}
