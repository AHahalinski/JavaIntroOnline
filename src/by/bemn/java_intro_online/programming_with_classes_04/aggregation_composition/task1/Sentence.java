package by.bemn.java_intro_online.programming_with_classes_04.aggregation_composition.task1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sentence {
    private Word[] words;

    public Sentence(Word... words) {
        this.words = words;
    }

    public Word[] getWords() {
        return words;
    }

    public void setWords(Word[] words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return Arrays.stream(words).map(Word::toString).collect(Collectors.joining(" " ));
    }
}
