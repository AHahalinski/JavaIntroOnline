package by.bemn.java_intro_online.lesson05_basics_of_oop.task1;

import java.io.FileNotFoundException;

abstract class File {
    protected String name;
    protected Directory directory;
    protected boolean isExist;
    protected boolean isEmpty;


    protected File() {
    }

    abstract boolean rename(String newFullName);

    protected boolean add() {
        return directory.addFile(this);
    }

    abstract void show() throws FileNotFoundException;
}
