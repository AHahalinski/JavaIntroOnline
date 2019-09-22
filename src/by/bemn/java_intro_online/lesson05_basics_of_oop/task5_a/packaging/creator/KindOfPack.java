package by.bemn.java_intro_online.lesson05_basics_of_oop.task5_a.packaging.creator;

public enum KindOfPack {
    PAPER("бумага"),
    CELLOPHANE("целлофан"),
    BASKET("корзина");

    private String value;

    KindOfPack(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
