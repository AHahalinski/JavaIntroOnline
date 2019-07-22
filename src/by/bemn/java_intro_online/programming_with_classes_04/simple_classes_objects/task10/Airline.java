package by.bemn.java_intro_online.programming_with_classes_04.simple_classes_objects.task10;

import java.util.Arrays;

/*
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 *      a) список рейсов для заданного пункта назначения;
 *      b) список рейсов для заданного дня недели;
 *      c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Airline {
    private String destination;
    private int number;
    private String typePlane;
    private String timeDeparture;
    private Day[] daysDeparture;

    public Airline(String destination, int number, String typePlane, String timeDeparture, Day... daysDeparture) {
        this.destination = destination;
        this.number = number;
        this.typePlane = typePlane;
        this.timeDeparture = timeDeparture;
        this.daysDeparture = daysDeparture;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTypePlane() {
        return typePlane;
    }

    public void setTypePlane(String typePlane) {
        this.typePlane = typePlane;
    }

    public String getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(String timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    public Day[] getDaysDeparture() {
        return daysDeparture;
    }

    public void setDaysDeparture(Day[] daysDeparture) {
        this.daysDeparture = daysDeparture;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(daysDeparture).forEach(day -> stringBuilder.append(day.getName()).append(" "));

        return String.format("Airline #%04d\t%-8s\t%-10s\t%8s\t\t%s",
                number, destination, typePlane, timeDeparture, stringBuilder);
    }
}
