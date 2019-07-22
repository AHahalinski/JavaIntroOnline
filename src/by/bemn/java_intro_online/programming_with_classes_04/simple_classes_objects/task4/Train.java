package by.bemn.java_intro_online.programming_with_classes_04.simple_classes_objects.task4;

/*
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
 * назначения должны быть упорядочены по времени отправления.
 */

public class Train {
    private String destination;
    private int numberTrain;
    private String timeDeparture;

    public Train() {
        this.destination = "Destination Default";
        this.numberTrain = 1;
        this.timeDeparture = "00:00";
    }

    public Train(String destination, int numberTrain, String timeDeparture) {
        this.destination = destination;
        this.numberTrain = numberTrain;
        this.timeDeparture = timeDeparture;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberTrain() {
        return numberTrain;
    }

    public void setNumberTrain(int numberTrain) {
        this.numberTrain = numberTrain;
    }

    public String getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(String timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    public void getInformation() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Train #%d\t\t%-10s\t%s",
                numberTrain, destination, timeDeparture);
    }
}
