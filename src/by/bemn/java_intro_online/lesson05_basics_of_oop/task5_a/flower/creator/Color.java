package by.bemn.java_intro_online.lesson05_basics_of_oop.task5_a.flower.creator;

public enum Color {
    RED("красный"),
    WHITE("белый"),
    YELLOW("желтый"),
    PINK("розовый"),
    PURPLE("фиолетовый");

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
