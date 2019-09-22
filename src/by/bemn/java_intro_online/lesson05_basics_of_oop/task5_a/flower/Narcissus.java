package by.bemn.java_intro_online.lesson05_basics_of_oop.task5_a.flower;

import by.bemn.java_intro_online.lesson05_basics_of_oop.task5_a.flower.creator.Color;

public class Narcissus extends Flower {

    public Narcissus(String value, Color color) {
        super(value, color);
        cost = 3.15;
    }
}
