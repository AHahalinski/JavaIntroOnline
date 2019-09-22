package by.bemn.java_intro_online.lesson04_programming_with_classes.simple_classes_objects.task4;

public class Main {
    public static void main(String[] args) {
        Train[] trains = {
                new Train(),
                new Train("Moscow", 105, "19:50"),
                new Train("Minsk", 106, "21:15"),
                new Train("Warsaw", 308, "03:20"),
                new Train("Gomel", 215, "06:30"),
        };
        trains[0].setDestination("Gomel");
        trains[0].setNumberTrain(65);
        trains[0].setTimeDeparture("07:15");

        Schedule schedule = new Schedule(trains);

        schedule.getInformationTrain(308);

        schedule.sortingTrain();

        schedule.print();
    }

}


