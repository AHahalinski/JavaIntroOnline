package by.bemn.java_intro_online.programming_with_classes_04.simple_classes_objects.task2;

public class Main {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        System.out.println(test2.getName() + "   " + test2.getAge());

        test2.setAge(50);
        test2.setName("Maria");
        System.out.println(test2.getName() + "   " + test2.getAge());

        Test2 test21 = new Test2("Bil", 40);
        System.out.println(test21.getName() + "   " + test21.getAge());

        System.out.println(test2.getName() + "   " + test2.getAge());

    }
}
