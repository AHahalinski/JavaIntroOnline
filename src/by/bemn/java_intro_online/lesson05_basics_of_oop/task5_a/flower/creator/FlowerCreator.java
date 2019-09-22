package by.bemn.java_intro_online.lesson05_basics_of_oop.task5_a.flower.creator;

import by.bemn.java_intro_online.lesson05_basics_of_oop.task5_a.flower.*;

import java.util.Random;

public class FlowerCreator {

    public static Flower getFlower(KindOfFlower kind, Color color) {

        if (color == null) {
            color = Color.values()[(new Random()).nextInt(Color.values().length)];
        }

        switch (kind) {
            case ROSE:
                return new Rose(kind.getValue(), color);

            case TULIP:
                return new Tulip(kind.getValue(), color);

            case ORCHID:
                return new Orchid(kind.getValue(), color);

            case NARCISSUS:
                return new Narcissus(kind.getValue(), color);

            case LILY:
                return new Lily(kind.getValue(), color);

            default:
                return null;
        }

    }
}
