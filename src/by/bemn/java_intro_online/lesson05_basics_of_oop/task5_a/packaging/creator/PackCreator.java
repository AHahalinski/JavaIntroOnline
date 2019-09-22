package by.bemn.java_intro_online.lesson05_basics_of_oop.task5_a.packaging.creator;


import by.bemn.java_intro_online.lesson05_basics_of_oop.task5_a.packaging.Basket;
import by.bemn.java_intro_online.lesson05_basics_of_oop.task5_a.packaging.Cellophane;
import by.bemn.java_intro_online.lesson05_basics_of_oop.task5_a.packaging.Pack;
import by.bemn.java_intro_online.lesson05_basics_of_oop.task5_a.packaging.Paper;

public class PackCreator {

    public static Pack getPack(KindOfPack kind) {
        switch (kind) {
            case PAPER:
                return new Paper(kind.getValue());
            case CELLOPHANE:
                return new Cellophane(kind.getValue());
            case BASKET:
                return new Basket(kind.getValue());
            default:
                return null;
        }
    }
}
