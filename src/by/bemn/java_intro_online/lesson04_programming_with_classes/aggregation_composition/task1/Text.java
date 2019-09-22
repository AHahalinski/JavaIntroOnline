package by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Text {
    private Sentence[] title;
    private Sentence[] body;

    public Text(Sentence[] title, Sentence[] sentences) {
        this.title = title;
        this.body = sentences;
    }

    public Sentence[] getTitle() {
        return title;
    }

    public void setTitle(Sentence[] title) {
        this.title = title;
    }

    public Sentence[] getBody() {
        return body;
    }

    public void setBody(Sentence[] body) {
        this.body = body;
    }

    public void addSentences(Sentence... sentences) {
        Sentence[] temp = new Sentence[body.length + sentences.length];
        for(int i = 0; i < temp.length; i++){
            if(i<body.length) {
                temp[i] = body[i];
            } else {
                temp[i] = sentences[i-body.length];
            }
        }
        body = temp;
    }

    private String print(Sentence... sentences) {
        String strForPrint = String.join("", Arrays.stream(sentences).map(Sentence::toString).collect(Collectors.joining(" ")));
        return strForPrint;
    }

    public void printTitle() {
        String printTitle = print(title);
        System.out.println(printTitle);
    }

    public void printBody() {
        String printBady = print(body);
        System.out.println(printBady);
    }

    @Override
    public String toString() {
        String str = String.join("\n", print(title), print(body));
        return str;
    }
}
