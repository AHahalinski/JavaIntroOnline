package by.bemn.java_intro_online.lesson04_programming_with_classes.simple_classes_objects.task5;

public class Main {
    public static void main(String[] args) {
        Counter counterDefault = new Counter();
        System.out.println("current value start: " + counterDefault.getCurrentValue());

        for (int i = 0; i < 6; i++) {
            counterDefault.addOne();
            System.out.println("current value  add 1: " + counterDefault.getCurrentValue());
        }

        counterDefault.reduceOne();
        System.out.println("current value reduce 1: " + counterDefault.getCurrentValue());

        System.out.println("\n**************************************");

        Counter counterWithParam = new Counter(3, 9, 5);
        System.out.println("current value start: " + counterWithParam.getCurrentValue());

        for (int i = 0; i < 12; i++) {
            counterWithParam.addOne();
            System.out.println("current value  add 1: " + counterWithParam.getCurrentValue());
        }

        counterWithParam.reduceOne();
        System.out.println("current value reduce 1: " + counterWithParam.getCurrentValue());

        for (int i = 0; i > -1; i--) {
            counterWithParam.reduceOne();
            System.out.println("current value reduce 1: " + counterWithParam.getCurrentValue());
        }
    }
}
