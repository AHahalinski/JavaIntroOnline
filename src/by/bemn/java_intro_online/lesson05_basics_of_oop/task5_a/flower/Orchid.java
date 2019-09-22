package by.bemn.java_intro_online.lesson05_basics_of_oop.task5_a.flower;

import by.bemn.java_intro_online.lesson05_basics_of_oop.task5_a.flower.creator.Color;

public class Orchid extends Flower {

    public Orchid(String value, Color color) {
        super(value, color);
        cost = 5.0;
    }
}
