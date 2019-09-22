package by.bemn.java_intro_online.lesson04_programming_with_classes.simple_classes_objects.task5;

/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
 * на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
 * произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
 * позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class Counter {
    private int minValue = 0;
    private int maxValue = 10;
    private int currentValue = 0;

    public Counter() {
    }

    public Counter(int minValue, int maxValue, int currentValue) {
        if (minValue >= 0 && minValue < maxValue) {
            this.minValue = minValue;
        }

        if (maxValue > 0 && maxValue > minValue) {
            this.maxValue = maxValue;
        }

        if (currentValue >= minValue && currentValue <= maxValue) {
            this.currentValue = currentValue;
        }
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void addOne() {
        if (currentValue + 1 < maxValue) {
            currentValue++;
        } else {
            currentValue = maxValue;
        }
    }

    public void reduceOne() {
        if (currentValue - 1 > minValue) {
            currentValue--;
        } else {
            currentValue = minValue;
        }
    }
}
