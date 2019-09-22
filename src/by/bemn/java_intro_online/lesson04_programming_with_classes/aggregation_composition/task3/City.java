package by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task3;

public class City {
    private String name;

    public City(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
