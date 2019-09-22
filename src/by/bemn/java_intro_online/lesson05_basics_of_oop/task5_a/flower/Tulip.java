package by.bemn.java_intro_online.lesson05_basics_of_oop.task5_a.flower;

import by.bemn.java_intro_online.lesson05_basics_of_oop.task5_a.flower.creator.Color;

import java.util.StringJoiner;

public class Tulip extends Flower {
    private int height;

    public Tulip(String value, Color color) {
        super(value, color);
        cost = 1.25;
        height = 30;
    }

    @Override
    public String toString() {
        return new StringJoiner("\t")
                .add(super.toString())
                .add("height: " + height)
                .toString();
    }
}
