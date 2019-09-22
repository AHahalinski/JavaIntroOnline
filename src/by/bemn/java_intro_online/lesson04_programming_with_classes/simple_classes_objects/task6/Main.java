package by.bemn.java_intro_online.lesson04_programming_with_classes.simple_classes_objects.task6;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(10, 3, 50);
        System.out.println(clock);

        clock.addSeconds(126);
        System.out.println(clock);

        clock.setMinutes(10815);
        System.out.println(clock);

        clock.setMinutes(6);
        System.out.println(clock);

        clock.addHours(13);
        clock.addMinutes(65);
        System.out.println(clock);

        clock.setHours(8);
        clock.setMinutes(9);
        clock.setSeconds(10);
        System.out.println(clock);
    }
}
