package by.bemn.java_intro_online.lesson06_tasks.task1.view;
import by.bemn.java_intro_online.lesson06_tasks.task1.controller.catalog.Catalog;
import by.bemn.java_intro_online.lesson06_tasks.task1.controller.catalog.CatalogOfBooks;
import by.bemn.java_intro_online.lesson06_tasks.task1.controller.reader_writer_file.WriterData;

import static by.bemn.java_intro_online.lesson06_tasks.task1.view.ConsoleHelper.*;


public class Menu {
    private Catalog catalog;

    public Menu() {
    }

    public void downloadCatalog() {
        catalog = new CatalogOfBooks();
    }

    public void run() {
        authorization();
        while (true) {
            menu();
            chosePoint();
        }
    }

    private void authorization() {
        String login;
        String password;
        do {
            print("Login: ");
             login = readString();
            print("Password: ");
             password = readString();
             boolean isAutorization = catalog.authorization(login, password);
             if(isAutorization) {
                 break;
             } else {
                 print("Пользователя с таким логином или поролем нет. Попробуйте еще раз!");
             }
        } while (true);

    }

    private void menu() {
        print("\n************ Catalog ************");
        print("1. Показать все книги");
        print("2. Поиск");
        if (catalog.getClient().isAdmin()) {
            print("3. Изменить каталог");
            print("4. Выход");
        } else {
            print("3. Выход");
        }
        print("Выберете действие: ");
    }

    private void chosePoint() {
        switch (readInteger()) {
            case 1:
                print(catalog.show());
                break;
            case 2:
                break;
            case 3:
                if(catalog.getClient().isAdmin()) {

                } else {
                    exit();
                }
                break;
            case 4:
                if(catalog.getClient().isAdmin()) {
                    exit();
                }
            default:
                print("Такого пункта меню нет! Попробуйте еще раз\n");

        }
    }

    private void exit() {
        //add save data
        WriterData.saveUserData(catalog.getUsers());
        System.exit(0000);
    }
}
