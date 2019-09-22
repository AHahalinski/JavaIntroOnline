package by.bemn.java_intro_online.lesson05_basics_of_oop.task4.treasures;

import java.util.Random;

public class CreateTreasure {

    private Jewel type;
    private double cost;
    static int id = 1;

    public static Treasure create(){
        Random random= new Random();
        return new Treasure(id++, Jewel.values()[random.nextInt(Jewel.values().length)],
                random.nextInt(100000)/100d );
    }
}
