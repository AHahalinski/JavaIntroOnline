package by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task1;

public class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }
}
