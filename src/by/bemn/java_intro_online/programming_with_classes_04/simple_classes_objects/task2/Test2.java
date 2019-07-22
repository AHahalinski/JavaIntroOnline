package by.bemn.java_intro_online.programming_with_classes_04.simple_classes_objects.task2;

/*
 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
 * конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для
 * полей экземпляра класса.
 */

public class Test2 {
    private String name;
    private int age;

    public Test2() {
        this.name = "Bob";
        this.age = 15;
    }

    public Test2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
