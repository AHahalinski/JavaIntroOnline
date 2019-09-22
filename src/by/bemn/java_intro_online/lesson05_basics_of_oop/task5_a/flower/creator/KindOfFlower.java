package by.bemn.java_intro_online.lesson05_basics_of_oop.task5_a.flower.creator;

public enum KindOfFlower {
    ROSE("Роза"),
    TULIP("Тюльпан"),
    ORCHID("Орхидея"),
    NARCISSUS("Нарцисс"),
    LILY("Лилия");

    private String value;

    KindOfFlower(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
