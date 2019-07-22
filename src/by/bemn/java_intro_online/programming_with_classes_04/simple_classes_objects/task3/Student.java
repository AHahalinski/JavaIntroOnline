package by.bemn.java_intro_online.programming_with_classes_04.simple_classes_objects.task3;

/*
 *  Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 *  из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 *  номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Student {
    private String fio;
    private int groupNumber;
    private int[] notes = new int[5];

    public Student() {
        this.fio = "Ivanov I.I.";
        this.groupNumber = 1;
        this.notes = new int[]{5, 5, 5, 5, 5};
    }

    public Student(String fio, int groupNumber, int[] notes) {
        this.fio = fio;
        this.groupNumber = groupNumber;
        this.notes = notes;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getNotes() {
        return notes;
    }

    public void setNotes(int[] notes) {
        this.notes = notes;
    }

    public boolean isGoodStudent() {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] != 9 && notes[i] != 10) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("fio:\t%-15s\t groupNumber:\t%d", fio, groupNumber);
    }
}
