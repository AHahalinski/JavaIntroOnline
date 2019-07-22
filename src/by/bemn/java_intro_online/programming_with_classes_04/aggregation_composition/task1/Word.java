package by.bemn.java_intro_online.programming_with_classes_04.aggregation_composition.task1;

import java.util.StringJoiner;

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
