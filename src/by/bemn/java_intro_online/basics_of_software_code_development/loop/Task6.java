package by.bemn.java_intro_online.basics_of_software_code_development.loop;

import java.util.Scanner;

// Вывести на экран соответствий между символами
// и их численными обозначениями в памяти компьютера.

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter word : ");
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i) + " : " + (int)word.charAt(i));
        }
    }
}
