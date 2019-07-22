package by.bemn.java_intro_online.programming_with_classes_04.simple_classes_objects.task1;

public class Main {
    /*
     * Проверка Test1
     */
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.printVar();
        test1.setVar1(9);
        test1.setVar2(90);
        int maxVar = test1.getMax();
        System.out.println(maxVar);
        int sum = test1.getSum();
        System.out.println(sum);
    }
}
